package com.jv;


import junit.framework.TestCase;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class test1 extends TestCase {
    static LocalDate now = LocalDate.now();
    private Page myPage;
    private Page emptyPage;
    private Url myUrl;

    public void setUp() throws IOException {
        myUrl = new Url("https://www.mydigitalschool.com/ecole-multimedia-angers");
        myPage = new Page();
        myPage.url = myUrl.getUrl();
        emptyPage = new Page();
    }

    //@Test
    public void testLoadDom() {
//        try {
//            setUp();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            myPage.loadDom();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertTrue(myPage.getDom() instanceof Document);

    }


    public void testExtractLinks() throws IOException {
        testLoadDom();
        List myListUrl = myPage.extractLinks();
        assert (myListUrl.size() != 0);
    }

    public void testExtractLinksProf() {
        Document dom = Jsoup.parse("<html><head><title>Hello PArser !</title></head>"
                + "<body><p>Parsed<a href=\"http://en.wikipedia.org/wiki/HTML\">HTML</a> into"
                + " a <a href=\"#document\">DOC</a></p></body></html>");
        emptyPage.setDom(dom);

        try {
            List<Link> links = emptyPage.extractLinks();
            assertTrue(links.size() == 2);
            Link firstLink = new Link(new Url("http://en.wikipedia.org/wiki/HTML"), "HTML");
            assertTrue(firstLink.equals(links.get(0)));
            Link secondLink = new Link(new Url("#document"), "DOC");
            assertTrue(secondLink.equals(links.get(1)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




/*
    @Test
    public void testAge() {
        assert (calculateAge(new Personne(LocalDate.of(1980, 8, 6), "jerome")) == 38);
        assert (calculateAge(new Personne(LocalDate.of(1984, 2, 20), "camille")) == 35);
    }

    public int calculateAge(Personne p) {
        Period period = Period.between(p.getDateNaissance(), now);
        return period.getYears();
    }
*/
}
