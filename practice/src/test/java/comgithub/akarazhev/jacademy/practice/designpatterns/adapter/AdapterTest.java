package comgithub.akarazhev.jacademy.practice.designpatterns.adapter;

import com.github.akarazhev.jacademy.practice.designpatterns.adapter.Company;
import com.github.akarazhev.jacademy.practice.designpatterns.adapter.Entrepreneur;
import com.github.akarazhev.jacademy.practice.designpatterns.adapter.impl.ElectronicEntrepreneurImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AdapterTest {

    @Test
    void testAdapter(){
        Entrepreneur entrepreneur = new ElectronicEntrepreneurImpl();
        Company company = new Company(entrepreneur);
        company.purchaseComponent();
        company.purchaseComponent();
        assertEquals("ResistorResistor",company.makeDevice());
    }
}
