package utils.company;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyGenerator {
    private Company company;
    private Faker faker;

    public CompanyGenerator() {
        this.company = new Company();
        this.faker = new Faker();
    }

    public static CompanyGenerator generateRandomCompany() {
        CompanyGenerator companyGenerator = new CompanyGenerator();
        companyGenerator.company.setName(companyGenerator.faker.company().name());
        companyGenerator.company.setIndustry(companyGenerator.faker.company().industry());
        companyGenerator.company.setUrl(companyGenerator.faker.company().url());
        return companyGenerator;
    }

}
