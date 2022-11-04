/*package com.internmain.config;

import org.aspectj.apache.bcel.classfile.InnerClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "spring.boot.config.example") //Spring properties dosyaları ile konfigürasyonlarınızı uygulama dışından yönetebilir hale getirebilirsiniz.
@Component//Oluşturduğumuz beanimizin bir Spring Bean’i olduğunu ve Spring container tarafından bu anotasyon ile işaretlemiş bean Spring tarafından yönetilir.
public class SpringBootConfiguration {
    public  final InnerClass innerClass = new InnerClass();

    public InnerClass getInnerClass() {
        return innerClass;
    }
    //burada properties dosyasinda tanimladigimiz degerleri get ve set yardimiyla cektik
    //set deger atar get deger okur

    @ConfigurationProperties(prefix = "innerClass")
    public class InnerClass{
        public String property1;
        public String property2;
        public String property3;

        public String getProperty1() {
            return property1;
        }

        public void setProperty1(String p) {
            property1 = p;
        }

        public String getProperty2() {
            return property2;
        }

        public void setProperty2(String p) {
            property2 = p;
        }

        public String getProperty3() {
            return property3;
        }

        public void setProperty3(String p) {
            property3 = p;
        }


    }
    public String company;
    public int suite;
    public boolean active;

    private Map<String, String> map;
    private List<String> list;

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> m) {
        map = m;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> l) {
        list = l;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSuite() {
        return suite;
    }

    public void setSuite(int suite) {
        this.suite = suite;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
*/