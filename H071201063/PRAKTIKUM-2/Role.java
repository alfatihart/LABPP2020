class Role {

    public static void main(String[] args) {
      int menuIndex = 0;
      int subMenuIndex = 0;
      boolean isValidRole = false;
  
      if (args.length == 0) {
        System.out.println("What role you want to see ?");
        System.out.println("For example, try 'Admin'.");
        } else if (args.length == 1) {
        //isValidRole = args[0].equals("Super Admin") ? true : args[0].equals("Admin") ? true : args[0].equals("User") ? true : false;
        if(isValidRole == args[0].equals("Super Admin")){
          isValidRole = true;
        }else if(isValidRole == args[0].equals("Admin")){
          isValidRole = true;
        }else if(isValidRole == args[0].equals("User")){
          isValidRole = true;
        }

        if (isValidRole) {
          if(args[0].equals("Super Admin")){
            menuIndex++;
            System.out.printf("%d. Super Admin\n", menuIndex);
            subMenuIndex++;
            System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex, subMenuIndex);
            subMenuIndex++;
            System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
            subMenuIndex++;
            System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, subMenuIndex);
            menuIndex++;
            subMenuIndex= 0 + 1;
            System.out.printf("%d. Admin\n", menuIndex);
            System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
            subMenuIndex++;
            System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, subMenuIndex);
            menuIndex++;
            System.out.printf("%d. User\n", menuIndex);
            subMenuIndex = 0 + 1;
            System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
            subMenuIndex++;
            System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex);
          }
        else if(args[0].equals("Admin")){
            menuIndex++;
            subMenuIndex++;
            System.out.printf("%d. Admin\n", menuIndex);
            System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
            subMenuIndex++;
            System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, subMenuIndex);
            menuIndex++;
            System.out.printf("%d. User\n", menuIndex);
            subMenuIndex = 0 + 1;
            System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
            subMenuIndex++;
            System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex);
        }else if(args[0].equals("User")){
            menuIndex++;
            System.out.printf("%d. User\n", menuIndex);
            subMenuIndex++;
            System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
            subMenuIndex++;
            System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex);
          
        }else{
          System.out.println("Invalid Role");
          System.out.println("Valid Role : Super Admin, Admin, User");
        }
      } else {
          System.out.println("Invalid Role");
          System.out.println("Valid Role : Super Admin, Admin, User");
        }
        }else{
        System.out.println("Too many argument");
      }
    }
  }