package neos.tool.ip;

public class IPLocation {
	private String area;
    private String country;

    public IPLocation() {
        country = area = "";
    }

    public IPLocation getCopy() {
        IPLocation ret = new IPLocation();

        ret.country = country;
        ret.area    = area;

        return ret;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {

        // ���Ϊ������������IP��ַ��ĵ�������ʾCZ88.NET,�������ȥ��
        if (area.trim().equals("CZ88.NET")) {
            this.area = "����������";
        } else {
            this.area = area;
        }
    }
    
    @Override
    public String toString(){
    	return this.country+this.area;
    }
}