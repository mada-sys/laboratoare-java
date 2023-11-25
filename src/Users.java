public class Users implements Comparable<Users> {
    String country_name;
    String region;
    String income;
    Integer year;
    Integer cohort_size;
    Integer coverage;
    Integer cancer_prevented;
    Integer deaths_prevented;
    String assumption_type;
    Integer possible_cancer_cases;
    Integer possible_cancer_deaths;

    public Users(String country_name, String region, String income, Integer year, Integer cohort_size, Integer coverage, Integer cancer_prevented, Integer deaths_prevented, String assumption_type, Integer possible_cancer_cases, Integer possible_cancer_deaths) {
        this.country_name = country_name;
        this.region = region;
        this.income = income;
        this.year = year;
        this.cohort_size = cohort_size;
        this.coverage = coverage;
        this.cancer_prevented = cancer_prevented;
        this.deaths_prevented = deaths_prevented;
        this.assumption_type = assumption_type;
        this.possible_cancer_cases = possible_cancer_cases;
        this.possible_cancer_deaths = possible_cancer_deaths;
    }


    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCohort_size() {
        return cohort_size;
    }

    public void setCohort_size(Integer cohort_size) {
        this.cohort_size = cohort_size;
    }

    public Integer getCoverage() {
        return coverage;
    }

    public void setCoverage(Integer coverage) {
        this.coverage = coverage;
    }

    public Integer getCancer_prevented() {
        return cancer_prevented;
    }

    public void setCancer_prevented(Integer cancer_prevented) {
        this.cancer_prevented = cancer_prevented;
    }

    public Integer getDeaths_prevented() {
        return deaths_prevented;
    }

    public void setDeaths_prevented(Integer deaths_prevented) {
        this.deaths_prevented = deaths_prevented;
    }

    public String getAssumption_type() {
        return assumption_type;
    }

    public void setAssumption_type(String assumption_type) {
        this.assumption_type = assumption_type;
    }

    public Integer getPossible_cancer_cases() {
        return possible_cancer_cases;
    }

    public void setPossible_cancer_cases(Integer possible_cancer_cases) {
        this.possible_cancer_cases = possible_cancer_cases;
    }

    public Integer getPossible_cancer_deaths() {
        return possible_cancer_deaths;
    }

    public void setPossible_cancer_deaths(Integer possible_cancer_deaths) {
        this.possible_cancer_deaths = possible_cancer_deaths;
    }
    @Override
    public int compareTo(Users o) {
        return this.region.compareTo(o.region);

    }
}
