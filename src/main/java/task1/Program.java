package task1;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person("FIO #1","190293857");
        Entity entity1 = new Entity("ENTITY", "1245258885");

        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person1, 3000);
        DebitAccount<Entity> debitAccount1 = new DebitAccount<>(entity1, 2000000);

        var transaction = new Transaction<>(debitAccount1, creditAccount1, 400000);

        transaction.execute();
        transaction.execute();

        //Account<Person> account1 = new Account<>(person, 30000);
        //System.out.println(account1);

    }
}
