package utils.company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    private String name;
    private String url;
    private String logo;
    private String domainName;
    private String profession;
    private String industry;
}
