package Problem4.Exam;

import java.util.function.Predicate;

public class ClubMember
{
  private String name;
  private boolean male;
  private int age;
  private ClubMember partner;
  public static final Predicate<ClubMember> isMale = m -> m.male;
  public static final Predicate<ClubMember> isPartnerMember = m -> m.partner != null;
 
  public ClubMember(String name, boolean male, int age)
  {
    this.name = name;
    this.male = male;
    this.age = age;
  }
 
  public String getName()
  {
    return this.name;
  }
 
  public int getAge()
  {
    return age;
  }
 
  public ClubMember getPartner()
  {
    return partner;
  }
 
  @Override
  public String toString()
  {
    return name;
  }
  public static void registerPartners(ClubMember cm1,ClubMember cm2)
	{
	cm1.partner = cm2;
	cm2.partner = cm1;
	}
}