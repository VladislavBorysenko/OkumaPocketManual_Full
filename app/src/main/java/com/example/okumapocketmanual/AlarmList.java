package com.example.okumapocketmanual;

import java.util.ArrayList;

public class AlarmList {

    public static ArrayList<ExampleItem> getListData() {

        ArrayList<ExampleItem> list = new ArrayList<>();
        ExampleItem BUS_ERROR = new ExampleItem("0001", "BUS ERROR",
                " This alarm is caused when the bus error exception has occurred\n" +
                        "       in the CPU.\n" +
                        "       When the bus error occurs, the CPU status is displayed in\n" +
                        "       hexadecimal numbers.\n" +
                        "       At the same time, the red LED at the CPU rack lights up.\n" +
                        "       The bus error includes the following five types of errors:\n" +
                        "       3)Cycle time over error\n" +
                        "       4)ECC error\n" +
                        "       5)Protect error\n" +
                        "       6)Loop error\n" +
                        "       7)Double-bus error\n" +
                        "       Note:\n" +
                        "       Error display is not available in the case of double-bus error.\n" +
                        "       [Object] None\n" +
                        "       [Code] CPU status\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        Printed circuit boards\n" +
                        "        Mother board\n" +
                        "        Contact failure of card edge connector\n" +
                        "        Contact failure of flat cable\n" +
                        "        Switch settings\n" +
                        "       [Measures to Take]\n" +
                        "       Depending on the type of error encountered, check the following\n" +
                        "       points.\n" +
                        "       1)ECC error -> Main board, memory board\n" +
                        "       2)Protect error -> Main board\n" +
                        "       3)Cycle timer over error -> Judge the faulty PCB from the\n" +
                        "         access address.\n" +
                        "       4)Loop error -> PCB which generates the interruption in\n" +
                        "         question; judge the interruption\n" +
                        "         level from the status register.\n" +
                        "       5)System bus error -> All the main boards\n" +
                        "       6)Double-bus error -> All the PCB's\n" +
                        "       Then, carry out the following steps.\n" +
                        "       1)Check the switch settings.\n" +
                        "         Make sure that the boards are free of foreign material.\n" +
                        "         Make sure that flat cables are inserted securely.\n" +
                        "       2)Change the PCB inserting positions to see if there is any\n" +
                        "         change in the error status.\n" +
                        "       3)Replace the suspicious boards.");

        ExampleItem ADDRESS_ERROR = new ExampleItem("0002", "ADDRESS ERROR",
                "This error occurs when the CPU has accessed word operands, long\n" +
                        "       word operands or instructions by an odd number address.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board.");

        ExampleItem ILLEGAL_INSTRUCTION_ERROR = new ExampleItem("0003", "ILLEGAL INSTRUCTION ERROR",
                "his error occurs when the CPU has read an improper\n" +
                        "       instruction.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] None\n" +
                        "       [Measures to Take] None ");

        ExampleItem ZERO_DIVIDE_ERROR = new ExampleItem("0004", "ZERO DIVIDE ERROR",
                "This error occurs when the CPU executes a division command\n" +
                        "       with a divisor of \"0\".\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem CHK_INSTRUCTION_ERROR = new ExampleItem("0005", "CHK INSTRUCTION ERROR",
                "This error occurs when the CPU executes the CHK instruction\n" +
                        "       under certain conditions (such that the register value is less\n" +
                        "       than 0 or that the register value is greater than the upper\n" +
                        "       limit in the operand word.).\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem TRAPV_INSTRUCTION_ERROR = new ExampleItem("0006", "TRAPV INSTRUCTION ERROR",
                "This error occurs when the overflow condition bit is turned on\n" +
                        "       in the status register when the TRAPV instruction is executed\n" +
                        "       by the CPU.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem PRIVILEGE_VIOLATION_ERROR = new ExampleItem("0007", "PRIVILEGE VIOLATION ERROR",
                "This error occurs when the CPU executes a privilege instruction\n" +
                        "       (instructions that can be executed only in the supervisor\n" +
                        "       condition) in the user condition.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board.");

        ExampleItem TRACE_ERROR = new ExampleItem("0008", "TRACE ERROR",
                "This error occurs when the CPU executes an instruction in the\n" +
                        "       trace condition.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board.");

        ExampleItem LINE_1010_EMULATOR_ERROR = new ExampleItem("0009", "LINE 1010 EMULATOR ERROR",
                "This error occurs when the CPU executes a command starting with\n" +
                        "       \"A\"(A***).\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem LINE_1111_EMULATOR_ERROR = new ExampleItem("0010", "LINE 1111 EMULATOR ERROR",
                "This error occurs when the CPU executes a command starting with\n" +
                        "       \"F\"(F***).\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem EXCEPTION_VECTOR_ERROR = new ExampleItem("0011", "EXCEPTION VECTOR ERROR",
                " This error occurs when the CPU has referenced the exception\n" +
                        "       vector which is not referenced normally.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem SPURIOUS_INTERRUPT_ERROR = new ExampleItem("0012", "SPURIOUS INTERRUPT ERROR",
                "This error occurs when a spurious interruption to the CPU has\n" +
                        "       been made.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem INTERRUPT_ERROR = new ExampleItem("0013", "INTERRUPT ERROR",
                "This error occurs when an unusual interruption to the CPU has\n" +
                        "       been made.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        All the printed circuit boards which generate interruption\n" +
                        "        Error in setting interruption level\n" +
                        "       [Measures to Take]\n" +
                        "        Check the setting of interruption level setting switches at\n" +
                        "        individual printed circuit boards.\n" +
                        "        Judge the interruption level from the value at the status\n" +
                        "        register (SR) when an error has occurred.\n" +
                        "        The third digit from the rightmost digit indicates the on\n" +
                        "        level.\n" +
                        "        Replace the printed circuit board which generates the judged\n" +
                        "        interruption.\n" +
                        "        Replace the main board.\n" +
                        "        Replace the mother board. ");

        ExampleItem TRAP_INSTRUCTION_ERROR = new ExampleItem("0014", "TRAP INSTRUCTION ERROR",
                " This error occurs when the CPU has referenced the TRAP\n" +
                        "       exception vector which is not referenced normally.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem USER_INTERRUPT_ERROR = new ExampleItem("0015", "USER INTERRUPT ERROR",
                "This error occurs when unusual user interruption has occurred.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem COPROCESSOR_ROTOCOL_ERROR = new ExampleItem("0016", "COPROCESSOR PROTOCOL ERROR",
                "This error occurs when communication fails between the CPU and\n" +
                        "       the coprocessor.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem FORMAT_ERROR = new ExampleItem("0017", "FORMAT ERROR",
                "This error occurs when the CPU detects an improper value as a\n" +
                        "       result of data check required for operation control.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem UNINITIALIZED_INTERRUPT_ERROR = new ExampleItem("0018", "UNINITIALIZED INTERRUPT ERROR",
                "This error occurs when an interruption occurs before\n" +
                        "       initialization of the vector number for a peripheral device.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem FPCP_UNDEFINED_CONDITION_ERROR = new ExampleItem("0019", "FPCP UNDEFINED CONDITION ERROR",
                "This error occurs when the floating-point coprocessor attempts\n" +
                        "       execution of a comparison command with non-numerals.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem FPCP_INEXACT_RESULT_ERROR = new ExampleItem("0020", "FPCP INEXACT RESULT ERROR",
                "his error occurs when the floating-point coprocessor loses\n" +
                        "       some digits in arithmetic operation.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem FPCP_IVIDE_BY_ZERO_ERROR = new ExampleItem("0021", "FPCP DIVIDE BY ZERO ERROR",
                "This error occurs when the floating-point coprocessor attempts\n" +
                        "       division by a number having a denominator of \"0\" in execution\n" +
                        "       of a division command.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem FPCP_UNDERFLOW_ERROR = new ExampleItem("0022", "FPCP UNDERFLOW ERROR",
                "This error occurs when the floating-point coprocessor obtains\n" +
                        "       a value too small to express as a result of arithmetic\n" +
                        "       operation.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem FPCP_OPERAND_ERROR = new ExampleItem("0023", "FPCP OPERAND ERROR",
                "This error occurs when the floating-point coprocessor attempts\n" +
                        "       execution of an arithmetic statement which has no solution.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem FPCP_OVERFLOW_ERROR = new ExampleItem("0024", "FPCP OVERFLOW ERROR",
                "This error occurs when the floating-point coprocessor obtains\n" +
                        "       a value too large to express as a result of arithmetic\n" +
                        "       operation.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem FPCP_SIGNALING_NAN_ERROR = new ExampleItem("0025", "FPCP SIGNALING NAN ERROR",
                "This error occurs when the floating-point coprocessor attempts\n" +
                        "       execution of an arithmetic statement contains signaling\n" +
                        "       non-numerals.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations] Main board\n" +
                        "       [Measures to Take] Replace the main board. ");

        ExampleItem DEVICE_NAME = new ExampleItem("0100", "DEVICE NAME", "Wrong device name is designated.\n" +
                "       Or a device name designated for renaming differs from the\n" +
                "       source device name.\n" +
                "       [Character-string] Designated device name or None\n" +
                "       [Code]\n" +
                "       1->Mismatch of device names before and after renaming\n" +
                "       None->Cases other than \"code 1\".\n" +
                "       [Probable Faulty Locations]\n" +
                "       Error in spelling of the input device name\n" +
                "       Designation of device name whose use is not allowed.\n" +
                "       Designation of device name differing from the source device\n" +
                "       name (RENAME command)\n" +
                "       [Measures to Take]\n" +
                "       Refer to the operation manual.\n" +
                "       In the RENAME operation, designation of device name for\n" +
                "       the changed name is not required.");

        ExampleItem SECTOR_DEVICE_NAME = new ExampleItem("0101", "SECTOR_DEVICE_NAME",
                "As one of the parameters to be transferred to the sector\n" +
                        "       device or driver routine, the device name which is not allowed\n" +
                        "       as a sector device name is designated.\n" +
                        "       [Code]\n" +
                        "       FFFFFFFF-> The device name that a region has not been decided\n" +
                        "       \t   was designated.\n" +
                        "       None-> The device name which is not allowed as a sector device\n" +
                        "              name was designated.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Information on the sector device name is destroyed.\n" +
                        "       2)The partition map of the memory disk is destroyed.\n" +
                        "       3)The device name which is not allowed as a sector device\n" +
                        "         name was designated.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Check the user memory information in VID of the memory disk.\n" +
                        "       2)Please designate a device name of a normal discharge as a\n" +
                        "         sector device name.\n" +
                        "       [Related Specifications] OSP file structur");

        ExampleItem PRINT_DEVICE_NAME = new ExampleItem("0102", "PRINT DEVICE NAME",
                "In one of the parameters to be transferred to the printer\n" +
                        "       driver routine, an illegal device name is designated as\n" +
                        "       the print device name.\n" +
                        "       [Character-string] Designated device name\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The content of the variable PPRDV4 for print device name is\n" +
                        "       destroyed.");

        ExampleItem FILE_NAME = new ExampleItem("0105", "FILE NAME",
                " Characters \"*\" and \"?\" are used for a command not allowed\n" +
                        "       a file name. Or either or both of the file name and\n" +
                        "       the extension are omitted in the setting of default file name\n" +
                        "       for the USE command.\n" +
                        "       [Character-string] Designated file name\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       In the complete file name designation (except default),\n" +
                        "       characters\"*\" and \"?\" have been used.\n" +
                        "       File name and/or extension has been omitted in setting the\n" +
                        "       default file name for the USE command.\n" +
                        "       [Measures to Take]\n" +
                        "       Refer to the instructions for individual commands.");

        ExampleItem COMMAND_CHARACTER = new ExampleItem("0106", "COMMAND CHARACTER",
                "A command not in the command table has been designated.\n" +
                        "       [Character-string]\n" +
                        "       Command characters which have been input.\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Spelling error of a command\n" +
                        "       Input of a command not allowed in the mode currently selected\n" +
                        "       [Measures to Take]\n" +
                        "       Input the command using function keys.\n");

        ExampleItem COMMAND_SYNTAX = new ExampleItem("0107", "COMMAND SYNTAX",
                "Syntax error of commands\n" +
                        "       [Character-string] Designated command\n" +
                        "       [Code]\n" +
                        "       1->Delimiter is not \",\".\n" +
                        "       2->A command contains more than 8 characters.\n" +
                        "       3->A device name contains more than 3 characters.\n" +
                        "       4->A device name does not end with a colon \":\".\n" +
                        "       5->A file name contains more than 19 characters.\n" +
                        "       6->A file name contains characters other than alphanumeric\n" +
                        "          characters, and symbols \"*\", \"?\" and \"-\".\n" +
                        "       7->The first character of a file name or extension is other\n" +
                        "          than an alphabetic character, and symbols \"*\" and \"?\".\n" +
                        "       8->The option specification contains more than 16 characters\n" +
                        "          (\";\" not counted).\n" +
                        "       $21->Hexadecimal data contains more than 8 digit figures.\n" +
                        "       $22->Decimal data contains more than 10 digit figures.\n" +
                        "       $23->Decimal data contains more than 4 digit figures.\n" +
                        "       $24->Delimiter is not \"-\".\n" +
                        "       $25->Numerical value of hexadecimal data is wrong.\n" +
                        "       $26->The first alphabetic character is wrong.\n" +
                        "       $27->Delimiter is not \"=\".\n" +
                        "       $28->Hexadecimal data contains more than 2 digit or 3 digit\n" +
                        "            figures.\n" +
                        "       $29->Register name is wrong.\n" +
                        "       $2A->Surplus data is still used.\n" +
                        "       $2B->Delimiter is not \",\".\n" +
                        "       $2C->Trace register too much\n" +
                        "       $2D->Trace memory too much\n" +
                        "       $2E->Hexadecimal data is not an even number.\n" +
                        "       $2F->Hexadecimal data contains more than 2 digit figures.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Input has been made by decimal number although hexadecimal\n" +
                        "       number should be used.\n" +
                        "       In the word size designation, an odd number address has been\n" +
                        "       designated.\n" +
                        "       Input has been made mistakenly.\n" +
                        "       [Measures to Take]\n" +
                        "       Refer to the instructions for individual commands.");

        ExampleItem OPTION = new ExampleItem("0108", "OPTION",
                "Wrong option characters have been designated.\n" +
                        "       [Character-string] Commanded option\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       An option not usable with the command designated has been\n" +
                        "       designated.\n" +
                        "       [Measures to Take]\n" +
                        "       Refer to the instructions for individual commands.");

        ExampleItem FILE_ATTRIBUTE = new ExampleItem("0110", "FILE ATTRIBUTE",
                "An attempt is made to read a file other than sequential file\n" +
                        "       and contiguous file. Or an attempt is made to read\n" +
                        "       a contiguous file in the sequential file reading processing,\n" +
                        "       or to read a sequential file in the contiguous file reading\n" +
                        "       processing.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Attribute code of the file to be read\n" +
                        "       1->Contiguous file\n" +
                        "       2->Sequential file\n" +
                        "       Others->Unknown file\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Contiguous file has been designated in the list display,\n" +
                        "       editing and other processing.\n" +
                        "       File directory of the memory, floppy disk, etc. has been\n" +
                        "       destroyed. During multi-task execution, directory of other\n" +
                        "       file has been read by other task.\n" +
                        "       Part program file has been designated in reading the control\n" +
                        "       program file.");

        ExampleItem DEVICE_FULL = new ExampleItem("0111", "DEVICE FULL",
                "Available storage area size of the designated device is\n" +
                        "       smaller than the required number of sectors.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Necessary number of remaining sectors\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Available area is not actually sufficient.\n" +
                        "       SAT sector information of the device has been destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Delete unnecessary files.\n" +
                        "       Check the available area size with the FREE command.\n" +
                        "       Subtract the sizes of files registered from the device memory\n" +
                        "       capacity and compare it with the data displayed for FREE\n" +
                        "       command.");

        ExampleItem DISK_UNINITIALIZED = new ExampleItem("0112", "DISK UNINITIALIZED",
                "The floppy disk is not initialized to the OSP format.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Floppy disk or memory formatted to other format\n" +
                        "       (EXORMACS, IBM, etc.)\n" +
                        "       Contents of VID of floppy disk or memory have been destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       To use an IBM format floppy disk, change the setting.\n" +
                        "       Check the contents at sector 0 (VID).\n" +
                        "       Usually, new floppy disks are formatted to IBM format.\n" +
                        "       Therefore, initialize the disk to the OSP format using\n" +
                        "       the INIT command.");

        ExampleItem ERROR_MAP_INFORMATION = new ExampleItem("0114", "ERROR-MAP INFORMATION",
                "Wrong sector identification name for error map information\n" +
                        "       (containing faulty track information) of the IBM-formatted\n" +
                        "       floppy disk.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       0->Wrong sector identification name\n" +
                        "       1->Wrong data of faulty track\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Error map information sector has been destroyed.\n" +
                        "       [Measure\ts to Take]\n" +
                        "       Check the contents of the error map sector.");

        ExampleItem SVCL = new ExampleItem("0118", "SVCL",
                "The NC control software issued an undefined system call\n" +
                        "       (SVCL).\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Address near the wrongly called address\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Wrong control software is used.\n" +
                        "       [Measures to Take]\n" +
                        "       Check and change the control software.");

        ExampleItem MEMORY_DISK_ACCESS_SECTOR_OVER = new ExampleItem("0124", "MEMORY DISK ACCESS SECTOR OVER",
                "Reading from or writing to the memory disk (MD) is attempted\n" +
                        "       exceeding the capacity of the largest sector.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXX->Sector number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file control data in the memory disk is destroyed.\n" +
                        "       The data file of the control floppy is not suitable for the\n" +
                        "       actual memory disk capacity.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the file control data for defects.\n" +
                        "       Reinstall the suitable control data file.");

        ExampleItem MEMORY_DISK_ROM_ACCESS = new ExampleItem("0125", "MEMORY DISK ROM ACCESS",
                "Reading from or writing to the memory disk (FR) is attempted\n" +
                        "       exceeding the capacity of the largest sector.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXX->Sector number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file control data in the memory disk is destroyed.\n" +
                        "       The data file of the control floppy is not suitable for\n" +
                        "       the actual memory disk capacity.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the file control data for defects.\n" +
                        "       Reinstall the suitable control data file.");

        ExampleItem DMA_TRANSFER_SECTOR_OVER = new ExampleItem("0126", "DMA TRANSFER SECTOR OVER",
                "In one of the parameters to be transferred to the driver\n" +
                        "       routine of the memory or the floppy disk, 0 or a value over 8\n" +
                        "       is designated as the number of sectors to be accessed at\n" +
                        "       a time.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Designated number of sectors\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The number of sectors is not set at the parameter.");

        ExampleItem MEMORY_DISK_BATTERY_VOLTAGE_LOW = new ExampleItem("0127", "MEMORY DISK BATTERY VOLTAGE LOW",
                "The battery voltage of the memory disk (MD) is low.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Memory disk (MD) battery life\n" +
                        "       [Measures to Take]\n" +
                        "       Change the battery with a new one.");

        ExampleItem MEMORY_DISK_FORMAT = new ExampleItem("0128", "MEMORY DISK FORMAT",
                "The NC has failed to properly check the control data stored\n" +
                        "       in the memory disk (MD).\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The control data has not been properly installed.\n" +
                        "       [Measures to Take]\n" +
                        "       1) Reinstall the control data.\n" +
                        "       2) SRAM card of UCMB is switching.\n" +
                        "       3) UCMB is switching.");

        ExampleItem FLOPPY_DISK_READ_WRITE = new ExampleItem("0130", "FLOPPY DISK READ/WRITE",
                "Read/write processing from and to a floppy disk is not\n" +
                        "       correctly completed.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXXXYY\n" +
                        "       XXXXXX:\n" +
                        "       Contents of result status 0-2 of the floppy disk\n" +
                        "       YY:\n" +
                        "       =05 or 45-> Error in writing\n" +
                        "        05:  head 0\n" +
                        "        45:  head 1\n" +
                        "       =06 or 46-> Error in reading\n" +
                        "        06:  head 0\n" +
                        "        46:  head 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Floppy disk media\n" +
                        "       Floppy disk drive\n" +
                        "       [Measures to Take]\n" +
                        "       Read and check the data from all the sectors.\n" +
                        "       Try data read/write using the other disk.\n" +
                        "       Try data read/write by setting the problem disk into the other\n" +
                        "       disk drive.\n" +
                        "       When data can be deleted, initialize the disk\n" +
                        "       (by FORMAT command) and retry data writing.");

        ExampleItem FLOPPY_DISK_ACCESS_SECTOR_OVER = new ExampleItem("0131", "FLOPPY DISK ACCESS SECTOR OVER",
                "Among the parameters to be passed to the floppy disk driver\n" +
                        "       routine, the sector number to be accessed is larger than\n" +
                        "       the actual floppy diskette capacity.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Sector number accessed\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Diskette media type is wrong.\n" +
                        "       Contents of VID or SDB in the diskette are destroyed.\n" +
                        "       File directory contents are destroyed.\n" +
                        "       The pointer data showing data block linkage in the sequential\n" +
                        "       file is destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Display the sequential file list.\n" +
                        "       Check the contents of VID and SDB directories.");

        ExampleItem FLOPPY_DISK_WRITE_VERIFY = new ExampleItem("0132", "FLOPPY DISK WRITE VERIFY",
                "Data mismatch is discovered when the data written into floppy\n" +
                        "       disk is verified against source data.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Physical sector number at which error has occurred\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk or floppy disk drive unit\n" +
                        "       Defective main board or DMA\n" +
                        "       During execution of multi-task, contents of main memory being\n" +
                        "       written by other task have been changed.\n" +
                        "       [Measures to Take]\n" +
                        "       Try again using other floppy disk.\n" +
                        "       Try again using the floppy disk causing the error at another\n" +
                        "       floppy disk drive.\n" +
                        "       Replace the main board.");

        ExampleItem FLOPPY_DISK_SEEK = new ExampleItem("0133", "FLOPPY DISK_SEEK",
                "Floppy disk seek operation is not correctly completed.\n" +
                        "       (\"Seek\" indicates the operation to move the FDD head to\n" +
                        "        the designated track position.)\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXYY:\n" +
                        "       XX->Result status 0 of the floppy disk\n" +
                        "       YY->Cylinder number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk\n" +
                        "       Defective floppy disk drive unit\n" +
                        "       [Measures to Take]\n" +
                        "       Try floppy disk seek using the other disk.\n" +
                        "       Try floppy disk seek by setting the problem disk into\n" +
                        "       the other disk drive.");

        ExampleItem FLOPPY_DISK_RECALIBRATE = new ExampleItem("0134", "FLOPPY DISK RECALIBRATE",
                "Floppy disk recalibration is not correctly completed.\n" +
                        "       Note: \"Recalibration\" means the operation to move the FDD\n" +
                        "              head to the track No. 0 position.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXX->Contents of result status 0-1 of the floppy disk\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk\n" +
                        "       Defective floppy disk drive unit\n" +
                        "       [Measures to Take]\n" +
                        "       Try floppy disk seek using the other disk.\n" +
                        "       Try floppy disk seek by setting the problem disk into\n" +
                        "       the other disk drive.");


        ExampleItem FLOPPY_DISK_FORMATTING = new ExampleItem("0135", "FLOPPY DISK FORMATTING",
                "Error during floppy disk formatting\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXXXXXX->Contents of result status 0, 1, 2, 3 of floppy disk\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk\n" +
                        "       Defective floppy disk drive unit\n" +
                        "       Wrong designation of floppy disk type\n" +
                        "       [Measures to Take]\n" +
                        "       Use another diskette");

        ExampleItem FLOPPY_DISK_TIME_OUT = new ExampleItem("0136", "FLOPPY DISK TIME OUT",
                "The floppy disk drive controller does not return the answer\n" +
                        "       within a specified cycle time.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       1->During read/write operation\n" +
                        "       2->During formatting\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Floppy disk media\n" +
                        "       Floppy disk drive unit");

        ExampleItem FLOPPY_READY = new ExampleItem("0137", "FLOPPY READY",
                "The floppy disk is not in the ready state.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The floppy diskette medium is not properly set in the disk\n" +
                        "       unit.\n" +
                        "       [Measures to Take]\n" +
                        "       Check if the READY lamp is lit on the drive unit front panel.");

        ExampleItem FLOPPY_DISK_WRITE_PROTECT = new ExampleItem("0138", "FLOPPY DISK WRITE PROTECT",
                "Writing onto the floppy disk is impossible.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The floppy disk is write-protected.\n" +
                        "       [Measures to Take]\n" +
                        "       Change the disk to write-enabled (by handling the protect\n" +
                        "       notch on the disk.)");

        ExampleItem DMA_TRANSFER = new ExampleItem("0143", "DMA TRANSFER",
                "An error occurred during transfer of DMA, or the transfer\n" +
                        "       operation was not completed.\n" +
                        "       [Character-string]\n" +
                        "       Floppy->An error occurred in the DMA on FRP board.\n" +
                        "       Memory disk->An error occurred in the DMA on the UCMB.\n" +
                        "       [Code]\n" +
                        "       XXXX: DMA error status (Refer to the end of this book.)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)DMA transfer destination board\n" +
                        "       2)Faulty DMA on FRP or UCMB\n" +
                        "       [Measures to Take]\n" +
                        "       1)Change the DMA transfer destination board.\n" +
                        "       2)Change the FRP board.\n" +
                        "       3)Change the UCMB (RAM card or FR card).");

        ExampleItem CAP_ACP_READY = new ExampleItem("0146", "CAP/ACP_READY",
                "An error occurred during initialization of CRP or ACP board.\n" +
                        "       [Code]\n" +
                        "       1->CRP or ACP board ready flag does not come ON.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty CRP or ACP board\n" +
                        "       [Measures to Take]\n" +
                        "       Change the CRP or ACP board.");

        ExampleItem MEMORY_WRITE_READ_TEST = new ExampleItem("0147", "MEMORY WRITE/READ TEST",
                "In the read/write test of the main memory, the written data\n" +
                        "       did not match the read data.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Address where the error was found by the main memory test\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Main memory (main board)\n" +
                        "         The code shows the address of the main board.\n" +
                        "       2)A memory-related switch is wrongly set on the main board.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the main board switches for setting.\n" +
                        "       Replace the main board.");

        ExampleItem PROGRAM_LOAD = new ExampleItem("0148", "PROGRAM LOAD",
                "The loading file failed to load the program file.\n" +
                        "       [Character-string] Name of file to be loaded\n" +
                        "       [Code]\n" +
                        "       1->The program file has ended before even one character is\n" +
                        "          loaded.\n" +
                        "       3->The program file has ended during loading operation.\n" +
                        "       9->A wrong device name is designated.\n" +
                        "       10->A wrong file name is designated.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The program file is destroyed, or a wrong loading file is\n" +
                        "       used.\n" +
                        "       [Measures to Take]\n" +
                        "       Reinstall the program file.");

        ExampleItem NOT_FOUND_PROGRAM_FILE = new ExampleItem("0149", "NOT FOUND PROGRAM FILE",
                "The loading file was not able to find the program file to\n" +
                        "       be loaded.\n" +
                        "       [Character-string] Program file name\n" +
                        "       [Code] 11\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file to be loaded does not exist or a wrong loading\n" +
                        "       file is used.\n" +
                        "       [Measures to Take]\n" +
                        "       Reinstall the program file.");

        ExampleItem PROGRAM_LOAD_ADDRESS = new ExampleItem("0150", "PROGRAM_LOAD_ADDRESS",
                "The file has a wrong load address and, therefore, cannot be\n" +
                        "       loaded using the load information file.\n" +
                        "       [Character-string] Problem file name\n" +
                        "       [Code]\n" +
                        "       1->The file to be loaded is destroyed.\n" +
                        "       2->The file to be loaded or the load information file is\n" +
                        "          destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Check the data in the file to be loaded.\n" +
                        "       2)Check the load information file data.\n" +
                        "       3)Change the control floppy disk.");

        ExampleItem PROGRAM_ATTRIBUTE = new ExampleItem("0151", "PROGRAM_ATTRIBUTE",
                "The program file to be loaded by the loading file has wrong\n" +
                        "       attributes.\n" +
                        "       [Character-string] Program file name\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file to be loaded is destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the contents of the file to be loaded.");

        ExampleItem MEMORY_DISK_ROM_WRITE = new ExampleItem("0152", "MEMORY DISK ROM WRITE",
                "An error occurred during data writing onto the memory disk\n" +
                        "       (FR).\n" +
                        "       [Character-string]\n" +
                        "       Start of writing->Transition from readonly mode to program\n" +
                        "       \t\t  mode does not take place.\n" +
                        "       End of writing->Transition from program mode to readonly mode\n" +
                        "       \t\tdoes not take place.\n" +
                        "       Verify->Verification proved that the data written onto the\n" +
                        "       \tmemory disk (FR) did not match the original data. \n" +
                        "       Element delete->Elements in the memory disk cannot be deleted.\n" +
                        "       Task running->During task running, writing was attempted\n" +
                        "       \t      onto the memory disk (FR).\n" +
                        "       [Code]\n" +
                        "       1->An error occurred in the UCMB.\n" +
                        "       XXXXXXXX: Address near the error location\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1-> Faulty memory disk (FR)\n" +
                        "       2-> Faulty control software (task running)\n" +
                        "       [Measures to Take]\n" +
                        "       1-> Change the UCMB or flash memory card causing the error.\n" +
                        "       2-> Correct the control software (task running).");

        ExampleItem ROMCARD_WRITE_PROHIBIT = new ExampleItem("0153", "ROMCARD WRITE PROHIBIT",
                "Writing was attempted onto the ROM card (PROM card) area\n" +
                        "       mounted in the memory disk.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Partitions are not properly generated because of faulty\n" +
                        "       FRpartfile (extension code: FRI) in the FR control floppy\n" +
                        "       disk No. 1.\n" +
                        "       [Measures to Take]\n" +
                        "       * Change the control floppy disk for FR.");

        ExampleItem FLOPPY_RS232C_BLOCK = new ExampleItem("0154", "FLOPPY RS232C BLOCK",
                "An error occurred with the FR block which controls the UCMB\n" +
                        "       floppy disk and RS-232C.\n" +
                        "       [Code]\n" +
                        "       1 -> There is no response from the FR block firmware.\n" +
                        "       2 -> Illegal access of the main processor to the buffer memory\n" +
                        "            of FR block.\n" +
                        "       1XX -> The FR block firmware detected an error during\n" +
                        "              initialization.\n" +
                        "       Contents of XX\n" +
                        "       bit 7 - bit 30\tFixed\n" +
                        "       bit 2\t\tBuffer memory error\n" +
                        "       bit 1\t\tGeneral purpose register error\n" +
                        "       bit 0\t\tRAM error\n" +
                        "       If an error occurs, the corresponding bit is set ON.\n" +
                        "       There are cases that more than one bit is ON at the same time.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1) Faulty UCMB\n" +
                        "       [Measures to Take]\n" +
                        "       1) Replace the UCMB.");

        ExampleItem SECTOR_DEVICE_UNINITIALIZED = new ExampleItem("0155", "SECTOR DEVICE UNINITIALIZED",
                "The sector device is not initialized to the OSP format.\n" +
                        "       [Character-string]\n" +
                        "       Specified device name\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1) Destruction of the VID contents in the memory.\n" +
                        "       [Measures to Take]\n" +
                        "       1) Check the contents of sector 0 (VID).\n" +
                        "       [Referential Instruction Manual]\n" +
                        "       OSP file configuration");

        //-------------------------0200_0268------------------------------------

        ExampleItem SYSTEM_FILE_DATA = new ExampleItem("0200", "SYSTEM FILE DATA",
                "Although an attempt is made to load the system software\n" +
                        "       (with extension SYS) files, basic data in the file is wrong.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       1->Mismatch of start address of system file\n" +
                        "       2->Wrong load address\n" +
                        "       3->File data block 0, offset 0 is not \"LOB1\".\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file management information of the device in which the\n" +
                        "       system software is stored has been destroyed.\n" +
                        "       The system software has not been introduced through the\n" +
                        "       correct procedure.\n" +
                        "       [Measures to Take]\n" +
                        "       After examining the cause carefully, load the control software\n" +
                        "       from floppy disk or tape.");

        ExampleItem MAB_FULL = new ExampleItem("0201", "MAB FULL",
                "It is impossible to secure the memory block.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "       XXXX->Start address of the memory block\n" +
                        "       YYYY->End address of the memory block\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       A non-existent memory block is designated.");

        ExampleItem RECORD_BUFFER_OVER_FLOW = new ExampleItem("0202", "RECORD BUFFER OVER FLOW",
                "The read data file is larger than the specified data size.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The read data file does not have the end of record.");

        ExampleItem LOAD_OBJECT_ADDRESS = new ExampleItem("0203", "LOAD OBJECT ADDRESS",
                "The allocate address in the main memory for the load object\n" +
                        "       file (program) exists in the system program area, the vector\n" +
                        "       area or the system program variable area.\n" +
                        "       Or the allocated start address is greater than the allocated\n" +
                        "       end address.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The contents of the first data block (DB 0) of the load object\n" +
                        "       file has been destroyed.\n" +
                        "       When developing a program, area overlap has not been taken\n" +
                        "       into consideration.\n" +
                        "       An attempt to load the load object file to main memory\n" +
                        "       [Measures to Take]\n" +
                        "       Check the contents of the first data block (DB 0) of the\n" +
                        "       program file.");

        ExampleItem LOAD_OBJECT_ATTRIBUTE = new ExampleItem("0204", "LOAD OBJECT ATTRIBUTE",
                "Error in load object attribute of the load object file\n" +
                        "       (The data block 0 and offset 0 of the file is\n" +
                        "        other than \"LOB1\".)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Designation of contiguous file such as PBU file\n" +
                        "       Contents of file data block 0 have been destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the contents of the file data block (DB 0).");

        ExampleItem LOAD_VERIFY = new ExampleItem("0205", "LOAD VERIFY",
                "In the loading operation of the load object file, the data set\n" +
                        "       at the main memory address does not match the source data.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Address at which mismatch has occurred.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective main memory\n" +
                        "       During the execution of the multi-task, other task has changed\n" +
                        "       the memory contents.\n" +
                        "       [Measures to Take]\n" +
                        "       Check if the result of the main memory test conducted\n" +
                        "       when power is applied is correct.\n" +
                        "       The display on the operation panel must be 00.\n" +
                        "       Replace the UCMB(SRAM card , FR card)\n" +
                        "       Load the load object file individually using the debugger\n" +
                        "       utility.");

        ExampleItem DATA_BLOCK_SIZE = new ExampleItem("0206", "DATA BLOCK SIZE",
                "When loading a file into the main memory, an inconsistency is\n" +
                        "       found in the information on file size of the file control\n" +
                        "       data.\n" +
                        "       (For example, the size of file registered at PDB is smaller\n" +
                        "        than that of file indicatd at the data block 0.)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The information on file size is wrongly edited.\n" +
                        "       The file control data is destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Remake the file control data file.");

        ExampleItem SELECTED_NUMBER = new ExampleItem("0250", "SELECTED NUMBER",
                "A number other than those specified in the install mode was\n" +
                        "       selected.\n" +
                        "       [Measures to Take]\n" +
                        "       Select a required number from the specified numbers.");

        ExampleItem MEMORY_DISK_RAM_FORMAT = new ExampleItem("0252", "MEMORY DISK RAM FORMAT",
                "The NC failed to properly recognize the control data\n" +
                        "       in the memory disk (MD).\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)The memory disk control data is destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Properly connect the battery to the board.\n" +
                        "       2)Change the SRAM card of UCMB.\n" +
                        "       3)Change the UCMB.");

        ExampleItem MEMORY_DISK_RAM_WRITE_READ_TEST = new ExampleItem("0254", "MEMORY DISK RAM WRITE READ TEST",
                "The memory disk (MD) read/write test proved that the written\n" +
                        "       data did not correspond to the read data.\n" +
                        "       [Code]\n" +
                        "       Address where this error occurred in the memory test of\n" +
                        "       the memory disk RAM\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Defective memory in the memory disk\n" +
                        "         (UCMB or RAM card)\n" +
                        "       [Measures to Take]\n" +
                        "       1)Change the UCMB or SRAM card.");

        ExampleItem FR_PART_FILE_SIZE = new ExampleItem("0255", "FR PART FILE SIZE",
                "The FR-part-file size is wrong.\n" +
                        "       [Code] FR-part-file size\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The FR-part-file stored in the control floppy disk for FR is\n" +
                        "       wrong in size.\n" +
                        "       [Measures to Take]\n" +
                        "       Change the control floppy disk for FR.");

        ExampleItem FR_PART_FILE_NUMBER = new ExampleItem("0256", "FR PART FILE NUMBER",
                "An FR-part-file number is wrong.\n" +
                        "       [Code] FR-part-file number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)The FR-part-file stored in the control floppy disk for FR\n" +
                        "         has a wrong number.\n" +
                        "       2)The FR-part-file stored in the control floppy disk for FR\n" +
                        "         is destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Change the control floppy disk for FR.");

        ExampleItem FR_PART_FILE_LOAD_ADDRESS = new ExampleItem("0257", "FR-PART-FILE LOAD ADDRESS",
                "The FR-part-file is stored in the memory disk (FR) with\n" +
                        "       a wrong  address. Or, the address is larger than the last\n" +
                        "       address used in the memory disk (FR).\n" +
                        "       [Code] FR-part-file loading address\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)The FR-part-file stored in the control floppy disk for FR\n" +
                        "         is destroyed.\n" +
                        "       2)The FR-part-file stored in the control floppy disk for FR\n" +
                        "         has a wrong load address.\n" +
                        "       3)The ROM card is not properly mounted.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Change the control floppy disk for FR.\n" +
                        "       2)Mount the ROM card properly.\n" +
                        "       3)Adjust the memory disk (FR) capacity.");

        ExampleItem SIZE_OVER = new ExampleItem("0258", "SIZE OVER",
                "The partition size or the total FRpartfile size exceeds\n" +
                        "        the memory disk (MD) capacity.\n" +
                        "       [Character-string]\n" +
                        "       Partition setting command exceeding the memory disk capacity\n" +
                        "       [Code]\n" +
                        "       Memory disk capacity needed to install all the FRpartfiles\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Data size in the control floppy disk does not match\n" +
                        "         the memory disk capacity.\n" +
                        "       2)The memory disk or RAM card capacity is insufficient.\n" +
                        "       3)ROM card or RAM card is not properly mounted.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Adjust the memory disk (MD) capacity.\n" +
                        "         (Mount the RAM card properly.)\n" +
                        "       2)Adjust the memory disk (FR) capacity.\n" +
                        "         (Mount the ROM card properly.)\n" +
                        "       3)Change the control floppy disk.");

        ExampleItem DATA_WRITE_VERIFY = new ExampleItem("0261", "DATA WRITE VERIFY",
                "Verification proved that the data written onto the memory disk\n" +
                        "       did not match the original data.\n" +
                        "       [Code] Address where the mismatch occurred\n" +
                        "       [Probable Faulty Locations] Faulty UCMB or FR card\n" +
                        "       [Measures to Take] Change the UCMB or FR card.");

        ExampleItem MEMORY_DISK_ROM_ERASE = new ExampleItem("0262", "MEMORY DISK ROM ERASE",
                "Erasing the memory disk (FR) was tried in vain.\n" +
                        "       [Code] Unerased address\n" +
                        "       [Probable Faulty Locations] Faulty UCMB or FR card\n" +
                        "       [Measures to Take] Change the UCMB or FR card");

        ExampleItem FILE_HEADER = new ExampleItem("0263", "FILE HEADER",
                "The installation data file or format data file has a wrong\n" +
                        "       header.\n" +
                        "       [Character-string]\n" +
                        "       File header\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Wrong header in the installation data file or format data file\n" +
                        "       [Measures to Take]\n" +
                        "       Change the control floppy disk.");

        ExampleItem INSTALL_MODE_PROGRAM_LOAD = new ExampleItem("0264", "INSTALL MODE PROGRAM LOAD",
                "The NC failed to read the installation data file or format\n" +
                        "       data file, or failed to install a required file using the\n" +
                        "       installation data file.\n" +
                        "       [Character-string]\n" +
                        "       Installation or format data file name\n" +
                        "       [Code]\n" +
                        "       1->The file ended without loading any character.\n" +
                        "       3->The file ended during file loading.\n" +
                        "       9->The device name was wrongly specified.\n" +
                        "       10->The file name was wrongly specified.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The control floppy disk has a destroyed file.\n" +
                        "       [Measures to Take]\n" +
                        "       Change the control floppy disk.");

        ExampleItem CONTROL_SOFTWARE_ATTRIBUTE = new ExampleItem("0265", "CONTROL SOFTWARE ATTRIBUTE",
                "The file to be installed has a wrong attribute.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file to be installed is destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Change the control floppy disk.");

        ExampleItem WORK_AREA_SIZE = new ExampleItem("0267", "WORK AREA SIZE",
                "This error message is used in the testing environment and\n" +
                        "       does not normally appear.");

        ExampleItem MEMORY_DISK_BATTERY_VOLTAGE_LOW_0268 = new ExampleItem("0268", "MEMORY DISK BATTERY VOLTAGE LOW",
                "The battery voltage of the memory disk (MD) is low.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Memory disk (MD) battery life\n" +
                        "       [Measures to Take]\n" +
                        "       Change the battery with a new one.");

        //---------------------------300_356------------------------------------------------

        ExampleItem DEVICE_NAME_0300 = new ExampleItem("0300", "DEVICE NAME",
                "Wrong device name is designated. Or a device name designated\n" +
                        "       for renaming differs from the source device name.\n" +
                        "       [Character-string]\n" +
                        "       Designated device name or None\n" +
                        "       [Code]\n" +
                        "       1->Mismatch of device names before and after renaming\n" +
                        "       None->Cases other than \"code 1\".\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Error in spelling of the input device name\n" +
                        "       Designation of device name whose use is not allowed.\n" +
                        "       Designation of device name differing from the source device\n" +
                        "       name (RENAME command)\n" +
                        "       [Measures to Take]\n" +
                        "       Refer to the operation manual.\n" +
                        "       In the RENAME operation, designation of device name for\n" +
                        "       the changed name is not required.");
        ExampleItem SECTOR_DEVICE_NAME_0301 = new ExampleItem("0301", "Sector device name ",
                "As one of the parameters to be transferred to the sector\n" +
                        "       device or driver routine, the device name which is not allowedUC   \n" +
                        "          as a sector device name is designated.\n" +
                        "       [Code]\n" +
                        "       FFFFFFFF-> The device name that a region has not been decided\n" +
                        "       \t   was designated.\n" +
                        "       None-> The device name which is not allowed as a sector device\n" +
                        "              name was designated.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Information on the sector device name is destroyed.\n" +
                        "       2)The partition map of the memory disk is destroyed.\n" +
                        "       3)The device name which is not allowed as a sector device\n" +
                        "         name was designated.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Check the user memory information in VID of the memory disk.\n" +
                        "       2)Please designate a device name of a normal discharge as a\n" +
                        "         sector device name.\n" +
                        "       [Related Specifications] OSP file structure");

        ExampleItem PRINT_DEVICE_NAME_0302 = new ExampleItem("0302", "PRINT DEVICE NAME",
                "In one of the parameters to be transferred to the printer\n" +
                        "       driver routine, an illegal device name is designated\n" +
                        "       as the print device name.\n" +
                        "       [Character-string]\n" +
                        "       Designated device name\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The content of the variable PPRDV4 for print device name is\n" +
                        "       destroyed.");

        ExampleItem READER_DEVICE_NAME = new ExampleItem("0303", "READER DEVICE NAME",
                "A device name not allowed as a print device name is designated\n" +
                        "       in one of parameters to be transferred to tape reader driver\n" +
                        "       routine.\n" +
                        "       [Character-string]\n" +
                        "       Designate device name\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Contents of tape reader device name variable PTRDV4 have been\n" +
                        "       destroyed.");

        ExampleItem PUNCHER_DEVICE_NAME = new ExampleItem("0304", "PUNCHER DEVICE NAME",
                "A device name not allowed as a print device name is designated\n" +
                        "       in one of parameters to be transferred to punch driver\n" +
                        "       routine.\n" +
                        "       [Character-string]\n" +
                        "       Designated device name\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Contents of punch device name variable PTPDV4 have been\n" +
                        "       destroyed.");

        ExampleItem FILE_NAME_0305 = new ExampleItem("0305", "FILE NAME",
                "Characters \"*\" and \"?\" are used for a command not allowed\n" +
                        "       a file name. Or either or both of the file name and\n" +
                        "       the extension are omitted in the setting of default file name\n" +
                        "       for the USE command.\n" +
                        "       [Character-string]\n" +
                        "       Designated file name\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       In the complete file name designation (except default),\n" +
                        "       characters \"*\" and \"?\" have been used.\n" +
                        "       File name and/or extension has been omitted in setting the\n" +
                        "       default file name for the USE command.\n" +
                        "       [Measures to Take]\n" +
                        "       Refer to the instructions for individual commands.");

        ExampleItem COMMAND_CHARACTER_0306 = new ExampleItem("0306", "COMMAND_CHARACTER",
                "A command not in the command table has been designated.\n" +
                        "       [Character-string]\n" +
                        "       Command characters which have been input.\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Spelling error of a command\n" +
                        "       Input of a command not allowed in the mode currently selected\n" +
                        "       [Measures to Take]\n" +
                        "       Input the command using function keys.");

        ExampleItem COMMAND_SYNTAX_0307 = new ExampleItem("0307", "COMMAND SYNTAX",
                "Grammatical error in the command operand when the SBP monitor\n" +
                        "       is used\n" +
                        "       [Character-string]\n" +
                        "       Programmed command\n" +
                        "       [Code]\n" +
                        "       1->Incorrect data size\n" +
                        "       2->Memory verify error\n" +
                        "       3->Wrong delimiter code\n" +
                        "       4->Address of an odd number was designated without using bytes\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Grammatical error in the command input from the keyboard\n" +
                        "       (code 1, 3)\n" +
                        "       An attempt is made to write to read-only I/O address (code 2).\n" +
                        "       An odd number address is designated to access the word size\n" +
                        "       or long word size (code 4).\n" +
                        "       [Measures to Take]\n" +
                        "       Input a correct command from the keyboard.");

        ExampleItem OPTION_0308 = new ExampleItem("0308", "OPTION",
                "Wrong option characters have been designated.\n" +
                        "       [Character-string]\n" +
                        "       Commanded option\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       An option not usable with the command designated has been\n" +
                        "       designated.\n" +
                        "       [Measures to Take]\n" +
                        "       Refer to the instructions for individual commands.");

        ExampleItem RS232C_CHANNEL_IN_USE = new ExampleItem("0309", "RS232C CHANNEL IN USE",
                "An attempt to use the RS232C channel being used.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       During multi-task execution, an attempt is made to use\n" +
                        "       the RS232C channel which is being used by other task.");

        ExampleItem FILE_ATTRIBUTE_0310 = new ExampleItem("0310", "FILE ATTRIBUTE",
                "An attempt is made to read a file other than sequential file\n" +
                        "       and contiguous file.  Or an attempt is made to read\n" +
                        "       a contiguous file in the sequential file reading processing,\n" +
                        "       or to read a sequential file in the contiguous file reading\n" +
                        "       processing.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Attribute code of the file to be read\n" +
                        "       1->Contiguous file\n" +
                        "       2->Sequential file\n" +
                        "       Others->Unknown file\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Contiguous file has been designated in the list display,\n" +
                        "       editing and other processing.\n" +
                        "       File directory of the memory, floppy disk, etc. has been\n" +
                        "       destroyed.\n" +
                        "       During multi-task execution, directory of other file has been\n" +
                        "       read by other task.\n" +
                        "       Part program file has been designated in reading the control\n" +
                        "       program file.");

        ExampleItem DEVICE_FULL_0311 = new ExampleItem("0311", "DEVICE FULL",
                "Available storage area size of the designated device is\n" +
                        "       smaller than the required number of sectors.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Necessary number of remaining sectors\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Available area is not actually sufficient.\n" +
                        "       SAT sector information of the device has been destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Delete unnecessary files.\n" +
                        "       Check the available area size with the FREE command.\n" +
                        "       Subtract the sizes of files registered from the device memory\n" +
                        "       capacity and compare it with the data displayed for FREE\n" +
                        "       command.");

        ExampleItem DISK_UNINITIALIZED_0312 = new ExampleItem("0312", " DISK UNINITIALIZED",
                "The floppy disk is not initialized to the OSP format.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Floppy disk or memory formatted to other format\n" +
                        "       (EXORMACS, IBM, etc.)\n" +
                        "       Contents of VID of floppy disk or memory have been destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       To use an IBM format floppy disk, change the setting.\n" +
                        "       Check the contents at sector 0 (VID).\n" +
                        "       Usually, new floppy disks are formatted to IBM format.\n" +
                        "       Therefore, initialize the disk to the OSP format using\n" +
                        "       the INIT command.");

        ExampleItem FILE_LABEL_AREA_OVER_FLOW = new ExampleItem("0313", "FILE LABEL AREA OVER FLOW",
                "There is no area for registering file label on\n" +
                        "       the IBM-formatted floppy disk.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       File area of the IBM-formatted floppy disk is full.\n" +
                        "       [Measures to Take]\n" +
                        "       Delete unnecessary files using DEL command.\n" +
                        "       Check the number of files registered using the DIR command.\n" +
                        "       45 files for FD2-128\n" +
                        "       71 files for FD2-256D\n" +
                        "       19 files for FD1-128");

        ExampleItem ERROR_MAP_INFORMATION_0314 = new ExampleItem("0314", "ERROR MAP INFORMATION",
                "Wrong sector identification name for error map information\n" +
                        "       (containing faulty track information) of the IBM-formatted\n" +
                        "       floppy disk.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       0->Wrong sector identification name\n" +
                        "       1->Wrong data of faulty track\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Error map information sector has been destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the contents of the error map sector.");

        ExampleItem VOLUME_LABEL_INFORMATION = new ExampleItem("0315", "VOLUME LABEL INFORMATION",
                "Wrong volume label information* on the IBM-formatted floppy\n" +
                        "       disk.\n" +
                        "       * Equivalent to VID of OSP-formatted floppy disk.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Volume label information sector has been destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the contents of the volume label sector.");

        ExampleItem FILE_REGIST = new ExampleItem("0316", "FILE REGIST",
                "In the file directory information of the IBM-formatted floppy\n" +
                        "       disk, sector address data of the data block indicates \"0\"\n" +
                        "       cylinder.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       File directory sector has been destroyed.\n" +
                        "       In file registration process, the data block sector\n" +
                        "       information indicates \"0\" cylinder.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the contents of the file directory.");

        ExampleItem MULTI_VOLUME_INFORMATION = new ExampleItem("0317", "MULTI VOLUME INFORMATION",
                "In the registration of the file directory information to\n" +
                        "       the IBM-formatted floppy disk, a symbol not allowable as the\n" +
                        "       multi-volume identifier is used or the volume order number is\n" +
                        "       outside 0 - 99.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       1->Multi-volume identifier is other than \"sp\", \"C\" and \"L\".\n" +
                        "       2->Multi-volume order number is outside 0-99.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       File directory data in the main memory has been destroyed.");

        ExampleItem SVCL_0318 = new ExampleItem("0318", "SVCL",
                "The NC control software issued an undefined system call\n" +
                        "       (SVCL).\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Address near the wrongly called address\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Wrong control software is used.\n" +
                        "       [Measures to Take]\n" +
                        "       Check and change the control software.");

        ExampleItem RS232C_DEVICE_READ = new ExampleItem("0319", "RS232C DEVICE READ",
                "The DR signal which indicates that the device connected is\n" +
                        "       ready, has been turned off during data reading operation\n" +
                        "       through the RS232C interface.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Contents of RS232C interface status\n" +
                        "       Bit 0->DR signal ON/OFF status\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective device\n" +
                        "       Defective communication cables.\n" +
                        "       Connection specification is not proper.\n" +
                        "       [Measures to Take]\n" +
                        "       Check wiring diagram.\n" +
                        "       Continuity test of communication cables using a multi-tester.\n" +
                        "       Check the signal operation specification of the device\n" +
                        "       connected.");

        ExampleItem RS232C_TERMINAL_NOT_READY = new ExampleItem("0320", "RS232C TERMINAL NOT READY",
                "The DR signal which indicates that the device connected is\n" +
                        "       ready, is not turned on.\n" +
                        "       [Character-string]\n" +
                        "       Input->Error has occurred during input\n" +
                        "       Output->Error has occurred during output\n" +
                        "       Print->Error has occurred during printer output\n" +
                        "       [Code]\n" +
                        "       Contents of RS232C interface status\n" +
                        "       Bit 0->DR signal ON/OFF status\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The device is not in the ready state.\n" +
                        "       Defective communication cables\n" +
                        "       Connection specification is not proper.\n" +
                        "       Improper setting at check timer\n" +
                        "       [Measures to Take]\n" +
                        "       Check to be sure that the device is in the ON-LINE mode.\n" +
                        "       Check the wiring connection diagram.\n" +
                        "       Continuity test of communication cables using a multi-tester.\n" +
                        "       Check the signal operation specification of the device\n" +
                        "       connected.");

        ExampleItem RS232C_READY_STATUS_TIME_OUT = new ExampleItem("0321", "RS232C READY STATUS TIME OUT",
                "Signals and status of the device connected through the RS232C\n" +
                        "       interface are not set in the ready state.\n" +
                        "       During input (read operation):\n" +
                        "            RXRDY of RS232C USART status is not turned on\n" +
                        "            (no data transmitted from the device connected).\n" +
                        "       During output (punch operation), during print out:\n" +
                        "            TXEMP and TXRDY of RS232C USART status are not turned on.\n" +
                        "       CS signal of RS232C interface status is not in the ON state.\n" +
                        "       In case the communication parameter is set at \"READY  YES\",\n" +
                        "       CI signal is not in the ON state.\n" +
                        "       [Character-string]\n" +
                        "       Input->Error has occurred during input\n" +
                        "       Output->Error has occurred during output\n" +
                        "       Print->Error has occurred during printer output\n" +
                        "       [Code]\n" +
                        "       FFFFFFFF\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Device connected is not in the ready state or defective.\n" +
                        "       Improper communication parameter setting\n" +
                        "       Defective communication cable\n" +
                        "       Improper setting at check timer\n" +
                        "       Improper wiring specification\n" +
                        "       [Measures to Take]\n" +
                        "       Check the wiring diagram.\n" +
                        "       Continuity test of communication cables using a multi-tester.\n" +
                        "       Check the operation specifications of the device connected.\n" +
                        "       Check the communication parameter settings");

        ExampleItem RS232C_READY_INTERRUPT_TIME_OUT = new ExampleItem("0322", "RS232C READY INTERRUPT TIME OUT",
                "The interruption of the RS232C device by transmit/receive\n" +
                        "       processing does not occur within the time specified for\n" +
                        "       individual channels.\n" +
                        "       [Character-string]\n" +
                        "       Error has occurred at\n" +
                        "       input: input\n" +
                        "       output: output\n" +
                        "       [Code]\n" +
                        "       FFFFFFFF\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       During inputNo data transmission from the device connected\n" +
                        "       Defective communication cables.\n" +
                        "       Connection specification is not proper.\n" +
                        "       Improper setting at check timer.\n" +
                        "       Improper communication parameter setting\n" +
                        "       [Measures to Take]\n" +
                        "       Check the wiring diagram.\n" +
                        "       Continuity test of communication cables using a multi-tester.\n" +
                        "       Check the operation specifications of the device connected.\n" +
                        "       Check the communication parameter settings.");

        ExampleItem RS232C_DEVICE_NAME = new ExampleItem("0323", "RS232C DEVICE NAME",
                "A channel device name other than CN0, CN1, CN2, or CN3 has\n" +
                        "       been designated at one of parameters transferred to the RS232C\n" +
                        "       communication control signal driver routine.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Designation of a device other than RS232C device.");

        ExampleItem MEMORY_DISK_ACCESS_SECTOR_OVER_0324 = new ExampleItem("0324", "MEMORY DISK ACCESS SECTOR OVER",
                "Reading from or writing to the memory disk (MD) is attempted\n" +
                        "       exceeding the capacity of the largest sector.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXX->Sector number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file control data in the memory disk is destroyed.\n" +
                        "       The data file of the control floppy is not suitable for the\n" +
                        "       actual memory disk capacity.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the file control data for defects.\n" +
                        "       Reinstall the suitable control data file.");

        ExampleItem MEMORY_DISK_ROM_ACCESS_SECTOR_OVER = new ExampleItem("0325", "MEMORY_DISK_ROM_ACCESS_SECTOR_OVER",
                "Reading from or writing to the memory disk (FR) is attempted\n" +
                        "       exceeding the capacity of the largest sector.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXX->Sector number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file control data in the memory disk is destroyed.\n" +
                        "       The data file of the control floppy is not suitable for\n" +
                        "       the actual memory disk capacity.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the file control data for defects.\n" +
                        "       Reinstall the suitable control data file.");

        ExampleItem DMA_TRANSFER_SECTOR_OVER_0326 = new ExampleItem("0326", "DMA TRANSFER SECTOR OVER ",
                "In one of the parameters to be transferred to the driver\n" +
                        "       routine of the memory or the floppy disk, 0 or a value over 8\n" +
                        "       is designated as the number of sectors to be accessed at\n" +
                        "       a time.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Designated number of sectors\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The number of sectors is not set at the parameter.");

        ExampleItem MEMORY_DISK_FORMAT_0328 = new ExampleItem("0328", "MEMORY_DISK_FORMAT",
                "The NC failed to recognize the control data in the memory\n" +
                        "       disk (MD).\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The memory disk control data is destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Properly connect the battery to the board.\n" +
                        "       2)Change the SRAM card of UCMB.\n" +
                        "       3)Change the UCMB.");

        ExampleItem FLOPPY_DISK_READ_WRITE_0330 = new ExampleItem("0330", " FLOPPY DISK READ WRITE",
                "Read/write processing from and to a floppy disk is not\n" +
                        "        correctly completed.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXXXYY\n" +
                        "       XXXXXX:\n" +
                        "       Contents of result status 0 - 2 of the floppy disk\n" +
                        "       YY:\n" +
                        "       =05 or 45->   Error in writing\n" +
                        "        05:  head 0\n" +
                        "        45:  head 1\n" +
                        "       =06 or 46->   Error in reading\n" +
                        "        06:  head 0\n" +
                        "        46:  head 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Floppy disk media\n" +
                        "       Floppy disk drive\n" +
                        "       [Measures to Take]\n" +
                        "       Read and check the data from all the sectors.\n" +
                        "       Try data read/write using the other disk.\n" +
                        "       Try data read/write by setting the problem disk into\n" +
                        "       the other disk drive.\n" +
                        "       When data can be deleted, initialize the disk (by FORMAT\n" +
                        "       command) and retry data writing.");

        ExampleItem FLOPPY_DISK_ACCESS_SECTOR_OVER_0331 = new ExampleItem("0331", "FLOPPY DISK ACCESS SECTOR OVER",
                "Among the parameters to be passed to the floppy disk driver\n" +
                        "       routine, the sector number to be accessed is larger than\n" +
                        "       the actual floppy diskette capacity.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Sector number accessed\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Diskette media type is wrong.\n" +
                        "       Contents of VID or SDB in the diskette are destroyed.\n" +
                        "       File directory contents are destroyed.\n" +
                        "       The pointer data showing data block linkage in the sequential\n" +
                        "       file is destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Display the sequential file list.\n" +
                        "       Check the contents of VID and SDB directories.");

        ExampleItem FLOPPY_DISK_WRITE_VERIFY_0332 = new ExampleItem("0332", "FLOPPY DISK WRITE VERIFY",
                "Data mismatch is discovered when the data written into floppy\n" +
                        "       disk is verified against source data.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Physical sector number at which error has occurred\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk or floppy disk drive unit\n" +
                        "       Defective main board or DMA\n" +
                        "       During execution of multi-task, contents of main memory being\n" +
                        "       written by other task have been changed.\n" +
                        "       [Measures to Take]\n" +
                        "       Try again using other floppy disk.\n" +
                        "       Try again using the floppy disk causing the error at another\n" +
                        "       floppy disk drive.\n" +
                        "       Replace the main board.");

        ExampleItem FLOPPY_DISK_SEEK_0333 = new ExampleItem("0333", "FLOPPY DISK SEEK",
                "Floppy disk seek operation is not correctly completed.\n" +
                        "       (\"Seek\" indicates the operation to move the FDD head to the\n" +
                        "         designated track position.)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXYY:\n" +
                        "       XX->Result status 0 of the floppy disk\n" +
                        "       YY->Cylinder number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk\n" +
                        "       Defective floppy disk drive unit\n" +
                        "       [Measures to Take]\n" +
                        "       Try floppy disk seek using the other disk.\n" +
                        "       Try floppy disk seek by setting the problem disk into\n" +
                        "       the other disk drive.");

        ExampleItem FLOPPY_DISK_RECALIBRATE_0334 = new ExampleItem("0334", "FLOPPY DISK RECALIBRATE",
                "Floppy disk recalibration is not correctly completed.\n" +
                        "       Note: \"Recalibration\" means the operation to move the FDD\n" +
                        "              head to the track No. 0 position.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXX->Contents of result status 0-1 of the floppy disk\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk\n" +
                        "       Defective floppy disk drive unit\n" +
                        "       [Measures to Take]\n" +
                        "       Try floppy disk seek using the other disk.\n" +
                        "       Try floppy disk seek by setting the problem disk into\n" +
                        "       the other disk drive.");

        ExampleItem FLOPPY_DISK_FORMATTING_0335 = new ExampleItem("0335", "FLOPPY DISK FORMATTING ",
                "Error during floppy disk formatting.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       XXXXXXXX -> Contents of result status 0,1,2,3 of floppy disk\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective floppy disk\n" +
                        "       Defective floppy disk drive unit\n" +
                        "       Wrong designation of floppy disk type\n" +
                        "       [Measures to Take] Use another diskette");

        ExampleItem FLOPPY_DISK_TIME_OUT_0336 = new ExampleItem("0336", "FLOPPY DISK",
                "The floppy disk drive controller does not return the answer\n" +
                        "       within a specified cycle time.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       1->During read/write operation\n" +
                        "       2->During formatting\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Floppy disk media\n" +
                        "       Floppy disk drive unit");

        ExampleItem FLOPPY_READY_0337 = new ExampleItem("0337", "FLOPPY READY",
                "The floppy disk is not in the ready state.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)The floppy diskette medium is not properly set in the disk\n" +
                        "         unit.\n" +
                        "       [Measures to Take]\n" +
                        "       Check if the READY lamp is lit on the drive unit front panel.");

        ExampleItem FLOPPY_DISK_WRITE_PROTECT_0338 = new ExampleItem("0338", "FLOPPY DISK WRITE PROTECT",
                "Writing onto the floppy disk is impossible.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The floppy disk is write-protected.\n" +
                        "       [Measures to Take]\n" +
                        "       Change the disk to write-enabled (by handling the protect\n" +
                        "       notch on the disk.)");

        ExampleItem PTR_READ = new ExampleItem("0339", "PTR READ ",
                "Error in tape reading through the tape reader\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       PTR error status\n" +
                        "       Bit 1 ON->Asynchronization error\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Tape roll size is too large causing a problem in tape feed\n" +
                        "       by the PTR.\n" +
                        "       Defective PTR\n" +
                        "       [Measures to Take]\n" +
                        "       Reduce tape size of a program.");

        ExampleItem PTR_ERRATIC_OPERATION_DETECT = new ExampleItem("0340", "PTR ERRATIC OPERATION DETECT",
                "Asynchronization error with the PTR\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       PTR status\n" +
                        "       Bit 1 ON->Asynchronization error\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Tape roll size is too large causing a problem in tape feed by\n" +
                        "       the PTR.\n" +
                        "       Previous error has not been reset.\n" +
                        "       [Measures to Take]\n" +
                        "       Press the PTR error reset button.\n" +
                        "       Reduce tape size of a program.");

        ExampleItem PTR_READY_STATUS_TIME_OUT = new ExampleItem("0341", "PTR READY STATUS TIME OUT",
                "The ready status of the PTR is not turned on within\n" +
                        "       one second.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       FFFFFFFF\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The paper tape set lever of PTR is not in position.\n" +
                        "       Defective PTR\n" +
                        "       [Measures to Take]\n" +
                        "       Make sure that the paper tape set lever of PTR is in position.");

        ExampleItem PTR_READY_INTERRUPT_TIME_OUT = new ExampleItem("0342", "PTR READY INTERRUPT TIME OUT",
                "The interruption by the PTR ready does not occur within\n" +
                        "       ten seconds.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] FFFFFFFF\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defective PTR");

        ExampleItem DMA_TRANSFER_0343 = new ExampleItem("0343", "DMA TRANSFER",
                "An error occurred during transfer of DMA, or the transfer\n" +
                        "       operation was not completed.\n" +
                        "       [Character-string]\n" +
                        "       Floppy->An error occurred in the DMA on FRP board.\n" +
                        "       Memory disk->An error occurred in the DMA on the UCMB.\n" +
                        "       [Code]\n" +
                        "       XXXX: DMA error status (Refer to the end of this book.)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)DMA transfer destination board\n" +
                        "       2)Faulty DMA of UCMB or FRP board.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Change the DMA transfer destination board.\n" +
                        "       2)Change the FRP board.\n" +
                        "       3)Change the UCMB (SRAM card or FR card).");

        ExampleItem PRINTER = new ExampleItem("0344", "PRINTER",
                "The printer is placed in the error state.  Or it is not set\n" +
                        "       in the ready state within a preset cycle time.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Printer\n" +
                        "       Status\n" +
                        "       Bit 0 ON->Printer ready (RDY)\n" +
                        "       Bit 2 ON->Printer busy (BUSY)\n" +
                        "       Bit 3 ON->Paper out (PE)\n" +
                        "       Bit 4 ON->Printer in on-line mode (SEL)\n" +
                        "       Bit 5 ON->Video signal OFF (LD)\n" +
                        "       Bit 6 ON->Printer in error state (FLT)\n" +
                        "       Bit 7 ON->Interruption to main CPU (INT)\n" +
                        "       FFFFFFFF->The printer is not set in the ready state within\n" +
                        "       \t  a preset cycle time.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Paper out\n" +
                        "       Printer is not in the ON-LINE mode.\n" +
                        "       Improper setting at ready check timer\n" +
                        "       Printer cable is not connected.\n" +
                        "       [Measures to Take]\n" +
                        "       Correct the timer setting.\n" +
                        "       Check the printer status.\n" +
                        "       \t\tCheck the printer cable connection.");

        ExampleItem PUNCHER = new ExampleItem("0345", "PUNCHER",
                "The punch is not ready or error with the punch.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       FFFFFFFF->Punch is not ready.\n" +
                        "       Others->Punch status\n" +
                        "       Bit 1 ON:  Remaining tape volume low\n" +
                        "       Bit 2 ON:  Tape cut off or too tight\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Remaining tape volume is low.\n" +
                        "       Tape is cut off, or tape tension is too high and tape\n" +
                        "       punching is impossible.\n" +
                        "       Improper setting at ready check timer\n" +
                        "       [Measures to Take]\n" +
                        "       Replace paper tape roll, or re-set it.\n" +
                        "       Correct timer setting.");

        ExampleItem CAP_ACP_READY_0346 = new ExampleItem("0346", "CAP/ACP READY ",
                "An error occurred during initialization of CRP or ACP board.\n" +
                        "       [Code]\n" +
                        "       1->CRP or ACP board ready flag does not come ON.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty CRP or ACP board\n" +
                        "       [Measures to Take]\n" +
                        "       Change the CRP or ACP board.");

        ExampleItem MEMORY_WRITE_READ_TEST_0347 = new ExampleItem("0347", "MEMORY WRITE/READ TEST",
                "In the read/write test of the main memory, the written data\n" +
                        "       did not match the read data.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Address where the error was found by the main memory test\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Main memory (main board)\n" +
                        "         The code shows the address of the main board.\n" +
                        "       2)A memory-related switch is wrongly set on the main board.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the main board switches for setting.\n" +
                        "       Replace the main board.");

        ExampleItem PROGRAM_LOAD_0348 = new ExampleItem("0348", "PROGRAM LOAD ",
                "he loading file failed to load the program file.\n" +
                        "       [Character-string]\n" +
                        "       Name of file to be loaded\n" +
                        "       [Code]\n" +
                        "       1->The program file has ended before even one character is\n" +
                        "          loaded.\n" +
                        "       3->The program file has ended during loading operation.\n" +
                        "       9->A wrong device name is designated.\n" +
                        "       10->A wrong file name is designated.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The program file is destroyed, or a wrong loading file is\n" +
                        "       used.\n" +
                        "       [Measures to Take]\n" +
                        "       Reinstall the program file.");

        ExampleItem NOT_FOUND_PROGRAM_FILE_0349 = new ExampleItem("0349", "NOT FOUND PROGRAM FILE",
                "The loading file was not able to find the program file to be\n" +
                        "       loaded.\n" +
                        "       [Character-string] Program file name\n" +
                        "       [Code] 11\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file to be loaded does not exist or a wrong loading file\n" +
                        "       is used.\n" +
                        "       [Measures to Take]\n" +
                        "       Reinstall the program file.\n" +
                        "        ");

        ExampleItem PROGRAM_LOAD_ADDRESS_0350 = new ExampleItem("0350", "PROGRAM LOAD ADDRESS",
                "The file has a wrong load address and, therefore, cannot be\n" +
                        "       loaded using the load information file.\n" +
                        "       [Character-string] Problem file name\n" +
                        "       [Code]\n" +
                        "       1->The file to be loaded is destroyed.\n" +
                        "       2->The file to be loaded or the load information file is\n" +
                        "          destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Check the data in the file to be loaded.\n" +
                        "       2)Check the load information file data.\n" +
                        "       3)Change the control floppy disk.");

        ExampleItem PROGRAM_ATTRIBUTE_0351 = new ExampleItem("0351", "PROGRAM ATTRIBUTE",
                "The program file to be loaded by the loading file has wrong\n" +
                        "       attributes.\n" +
                        "       [Character-string] Program file name\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The file to be loaded is destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the contents of the file to be loaded.");

        ExampleItem MEMORY_DISK_ROM_WRIGHT = new ExampleItem("0352", "MEMORY DISK ROM WRIGHT ",
                "By entry management of memory disk (FR), an error occurred.\n" +
                        "       [Character string]\n" +
                        "       It begins to write it and produces ->\n" +
                        "          It can not transit on a program mode from mode of reading\n" +
                        "          only .\n" +
                        "       Entry end ->\n" +
                        "          It can not transit on mode of reading only from a program\n" +
                        "          mode.\n" +
                        "       Verify ->\n" +
                        "          When it collated the data which it has written to memory\n" +
                        "          disk (FR), it did not coincide with former data.\n" +
                        "       Element elimination ->\n" +
                        "          It can not eliminate an element of memory disk (FR).\n" +
                        "       In task cycle start ->\n" +
                        "          It was about to fill in memory disk (FR) in task cycle\n" +
                        "          start.\n" +
                        "       [Code]\n" +
                        "       1 -> An error occurs by the UCMB\n" +
                        "       XXXXXXXX: An address of the vicinity that an error occurred\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Inferiority of memory disk (FR)\n" +
                        "       A bad condition of control softwere\n" +
                        "        (In the case of 'task cycle start in ')\n" +
                        "       [Measures to take]\n" +
                        "       it exchanges the UCMB or FR card.\n" +
                        "       It amends control softwere.\n" +
                        "        (In the case of ' task cycle start in ')");

        ExampleItem ROM_CARD_WRIGHT_PROHIBITION = new ExampleItem("0353", "ROM CARD WRIGHT PROHIBITION",
                "It was about to fill in a territory of ROM card (PROM card)\n" +
                        "       which is mounting on a memory disk.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Partition is not generated by inferiority of file (extension\n" +
                        "       child in terms of FRI of file) of FR part which has entered\n" +
                        "       the 1st sheet of a control floppy for FR rightly.\n" +
                        "       [Measures to take]\n" +
                        "       It exchanges a control floppy for FR.");

        ExampleItem FLOPPY_RS232C_BLOCK_0354 = new ExampleItem("0354", "FLOPPY RS232C BLOCK",
                "An error occurred with the FR block which controls the UCMB\n" +
                        "       floppy disk and RS-232C.\n" +
                        "       [Code]\n" +
                        "       1 -> There is no response from the FR block firmware.\n" +
                        "       2 -> Illegal access of the main processor to the buffer memory\n" +
                        "            of FR block.\n" +
                        "       1XX -> The FR block firmware detected an error during\n" +
                        "              initialization.\n" +
                        "       Contents of XX\n" +
                        "       bit 7 - bit 30\tFixed\n" +
                        "       bit 2\t\tBuffer memory error\n" +
                        "       bit 1\t\tGeneral purpose register error\n" +
                        "       bit 0\t\tRAM error\n" +
                        "       If an error occurs, the corresponding bit is set ON.\n" +
                        "       There are cases that more than one bit is ON at the same time.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1) Faulty UCMB\n" +
                        "       [Measures to Take]\n" +
                        "       1) Replace the UCMB.");

        ExampleItem SECTOR_DEVICE_UNINITIALIZED_0355 = new ExampleItem("0355", "SECTOR DEVICE UNINITIALIZED",
                "The sector device is not initialized to the OSP format.\n" +
                        "       [Character-string]\n" +
                        "       Specified device name\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1) Destruction of the VID contents in the memory.\n" +
                        "       [Measures to Take]\n" +
                        "       1) Check the contents of sector 0 (VID).\n" +
                        "       [Referential Instruction Manual]\n" +
                        "       OSP file configuration");


        //-------------------------------------------0400_0410-----------------------------------------------------------------
        ExampleItem NOT_FOUND_UTILITY_COMMAND_FILE = new ExampleItem("0400", "NOT FOUND UTILITY COMMAND FILE",
                "The utility file or program file designated is not found in\n" +
                        "       the designated device.\n" +
                        "       [Character-string] Designated utility name\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Error in designating the device name\n" +
                        "       Spelling error in utility file name\n" +
                        "       The utility is not actually registered.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the files in the designated device using the DIR command.");
        ExampleItem LOAD_OBJECT_ADDRESS_0401 = new ExampleItem("0401", "LOAD OBJECT ADDRESS",
                "The allocate address in the main memory for the load object\n" +
                        "       file (program) exists in the system program area, the vector\n" +
                        "       area or the system program variable area. Or the allocated\n" +
                        "       start address is greater than the allocated end address.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The contents of the first data block (DB 0) of the load\n" +
                        "       object file has been destroyed.\n" +
                        "       When developing a program, area overlap has not been taken\n" +
                        "       into consideration.\n" +
                        "       An attempt to load the load object file to main memory\n" +
                        "       [Measures to Take]\n" +
                        "       Check the contents of the first data block (DB 0) of\n" +
                        "       the program file.");

        ExampleItem LOAD_OBJECT_ATTRIBUTE_0402 = new ExampleItem("0402", "LOAD OBJECT ATTRIBUTE",
                "Error in load object attribute of the load object file\n" +
                        "       (The data block 0 and offset 0 of the file is other than\n" +
                        "         \"LOB1\".)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Designation of contiguous file such as PBU file\n" +
                        "       Contents of file data block 0 have been destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the contents of the file data block (DB 0).");

        ExampleItem DATA_BLOCK_SIZE_0403 = new ExampleItem("0403", "DATA BLOCK SIZE",
                "In the load object file, the number of sectors of the data\n" +
                        "       block which is indicated by the file directory is smaller\n" +
                        "       than \"the number of sectors + 1\" of the data block which is\n" +
                        "       to be installed to the memory which is indicated at data\n" +
                        "       block 0 of the file.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       File directory information or the contents at data block 0\n" +
                        "       (DB0) of the load object file have been destroyed.\n" +
                        "       During multi-task processing, contents of the file management\n" +
                        "       variable has been changed through file processing by other\n" +
                        "       task.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the file directory information and the contents at DB0");

        ExampleItem INITIALIZE_DEVICE_NAME = new ExampleItem("0404", "INITIALIZE DEVICE NAME",
                "Device \"MD0:\", \"FR0:\" or \"FR1:\" is designated, which must not\n" +
                        "       be designated with the initialize command, INIT or IN.\n" +
                        "       [Character-string]\n" +
                        "       Device name \"MD0:\", \"FR0:\" or \"FR1:\"\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Designation of device MD0: for which initialization using\n" +
                        "       the initialization command is not allowed or FR0: or FR1:\n" +
                        "       which can not be initialized by the initialization command.\n" +
                        "       [Measures to Take]\n" +
                        "       Initialization of MD0:, FR0: and FR1: using the initialization\n" +
                        "       command is not allowed.");

        ExampleItem FLOPPY_DISK_INITIALIZE = new ExampleItem("0405", "FLOPPY DISK INITIALIZE",
                "For initialization, the floppy disk type is other than\n" +
                        "       FD2-128, FD2-256, FD2-256D, FD1-128.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Floppy disk format information is other than OSP and IBM.\n" +
                        "       Record length of the floppy disk in question is 512 or 1024\n" +
                        "       bytes.\n" +
                        "       VID or volume label information has been destroyed.\n" +
                        "       [Measures to Take]\n" +
                        "       Determine forcibly using the F option of the INIT command.\n" +
                        "       Do not use floppy disk whose record length is 512 or 1024\n" +
                        "       bytes.");

        ExampleItem PATCH_SECTOR_AREA = new ExampleItem("0406", "PATCH SECTOR AREA",
                "The sector designated by patch does not exist.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       In the designation of the correction sector number of the\n" +
                        "       PATCH command, a value greater than the number of data blocks\n" +
                        "       (sectors) has been input.\n" +
                        "       A decimal number has been designated for the data to be\n" +
                        "       designated by a hexadecimal number.\n" +
                        "       In the designation of a device, a value greater than the\n" +
                        "       capacity of that device has been designated.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the number of sectors of the file using the DIR command.");

        ExampleItem PATCH_SECTOR_ADDRESS_OVER = new ExampleItem("0407", "PATCH SECTOR ADDRESS OVER",
                "The address within the sector specified by patch is outside\n" +
                        "       0 through $FF.\n" +
                        "       [Character-string]\n" +
                        "       Contents of input data for the addresses exceeding the\n" +
                        "       allowable range\n" +
                        "       [Code]\n" +
                        "       1-> Input of the correction data is too much and the addresses\n" +
                        "           for the correction exceeds \"$FF\".\n" +
                        "       2-> When correcting the data to the identical data\n" +
                        "           continuously, designation of the last address is made\n" +
                        "           with a number greater than 100 (hexadecimal).\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The number of input data sets is too large.\n" +
                        "       Error in address designation\n" +
                        "       [Measures to Take]\n" +
                        "       In either cases of the error indicated above, memory\n" +
                        "       correction up to address $FF has been completed.\n" +
                        "       Therefore, if the processing is terminated using the Q command\n" +
                        "       to check the contents, contents of the device or the file are\n" +
                        "       updated accordingly. To quit without updating the contents,\n" +
                        "       do so with ABORT CONTROL C.");

        ExampleItem CONSOLE_LINE_SETTING = new ExampleItem("0408", "CONSOLE LINE SETTING",
                "In setting console line range for the CRT display using\n" +
                        "       the use command, the beginning and the end of the console line\n" +
                        "       numbers are outside 0-23, or the beginning line number is\n" +
                        "       greater than the end line number.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       An attempt to change the beginning or the end line without\n" +
                        "       checking the default values.\n" +
                        "       [Measures to Take]\n" +
                        "       Default\n" +
                        "       Beginning line->18\n" +
                        "       End line->21");

        ExampleItem FILE_WRITE_PROTECT = new ExampleItem("0409", "FILE WRITE PROTECT",
                " An attempt to release the protect state of the file which is\n" +
                        "       protected by the protect command.\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Protect level\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       An attempt to release the protect state of the system program\n" +
                        "       file\n" +
                        "       An attempt to release the protect state of the control program\n" +
                        "       file\n" +
                        "       An attempt to release the protect state of the PBU file\n" +
                        "       An attempt to release the protect state of the MSB file\n" +
                        "       [Measures to Take]\n" +
                        "       For system program, protect state cannot be released.\n" +
                        "       For other files in MD0:, select the OS mode to release the\n" +
                        "       protect state.");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("0410", "SYSTEM GENERATE",
                "A wrong file is specified by the system program registration\n" +
                        "       (SG) command.\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       2->A sequential file is specified.\n" +
                        "       3->There is an error in the load object attributes of\n" +
                        "          the specified file.\n" +
                        "       4->The program start address of the specified file is 0.\n" +
                        "       5->The specified sector device is an IBM-formatted\n" +
                        "          floppy disk.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Specified file\n" +
                        "       [Measures to Take]\n" +
                        "       Specify the correct file.");

//------------------------------------1071_1951-------------------------------------------------------------------------

        ExampleItem MEMORY_BOARD_BATTERY_HURRY_EXCHANGE = new ExampleItem("1071", "MEMORY BOARD BATTERY HURRY EXCHANGE",
                "The memory board battery has finished its service life.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        Battery in the memory board\n" +
                        "       [Measures to Take]\n" +
                        "        Replace the battery in the memory board.");

        ExampleItem PLC_ALARM_No_ILLEGAL = new ExampleItem("1089", "PLC ALARM No. ILLEGAL",
                "The PLC requested an alarm number outside the setting\n" +
                        "       range.\n" +
                        "       [Code]XYYYY\n" +
                        "        X:Requested alarm level\n" +
                        "         A->Request of alarm A\n" +
                        "         B->Request of alarm B\n" +
                        "         C->Request of alarm C\n" +
                        "         D->Request of alarm D\n" +
                        "        YYYY:Requested alarm number in hexadecimal");

        ExampleItem PLC_ALARM_MESSAGE_FILE_NOT_LOAD = new ExampleItem("1091", "PLC ALARM MESSAGE FILE NOT LOAD",
                "he PLC alarm message file is not found, disabling normal\n" +
                        "       alarm processing.\n" +
                        "       [Code] \n" +
                        "        PLC alarm message file loading status (hexadecimal)\n" +
                        "        1-> End of file was received without loading any character.\n" +
                        "        3-> End of file was received during file loading.\n" +
                        "        9-> The device name was wrongly specified.\n" +
                        "        A-> The file name was wrongly specified.\n" +
                        "        B-> The file was not found.");

        ExampleItem PLC_BACKUP_DATA_FILE_LOAD = new ExampleItem("1092", "PLC BACKUP DATA FILE LOAD",
                "Backup copy onto the PLC backup file failed.\n" +
                        "       [Code] XXXXYYYY\n" +
                        "        XXXX->Backup processing error status\n" +
                        "        YYYY->Backup cycle number");

        ExampleItem PLC_BACKUP_DATA_FILE_NOT_LOAD = new ExampleItem("1093", "PLC BACKUP DATA FILE NOT LOAD",
                "The PLC backup data file is not found, disabling backup\n" +
                        "       processing.\n" +
                        "       [Code]\n" +
                        "        PLC backup data file loading status (hexadecimal)\n" +
                        "        1  -> End of file was received without loading any character.\n" +
                        "        3  -> End of file was received during file loading.\n" +
                        "        9  -> The device name was wrongly specified.\n" +
                        "        A  -> The file name was wrongly specified.\n" +
                        "        B  -> The file was not found.\n" +
                        "        100-> Wrong PLC machine type\n" +
                        "        200-> Wrong PLC class\n" +
                        "        300-> Wrong file version");

        ExampleItem PLC_BACKUP_DATA_FILE_READING = new ExampleItem("1094", "PLC BACKUP DATA FILE PLC_BACKUP_DATA_FILE_READING",
                "PLC back up data file does not read from memory.\n" +
                        "       [Code] XXX\n" +
                        "        2  ->file open errors (file none)\n" +
                        "        3  ->file read errors (data none)\n" +
                        "        4  ->file attribute errors ('PBU1' be)\n" +
                        "        5  ->file close errors\n" +
                        "        6  ->file size errors (file size small)\n" +
                        "        7  ->file size errors (file size big)\n" +
                        "        100->A machine type of PLC differs.\n" +
                        "        200->A class of PLC differs.\n" +
                        "        300->File version differs.");

        ExampleItem SAFETY_SPEED_MONITOR_ERROR = new ExampleItem("1097", "SAFETY SPEED MONITOR ERROR",
                "Concerning check processing of Safety-Speed-Monitor\n" +
                        "       at the time of guard-close of production mode, error\n" +
                        "       signal of Safety-Speed-Monitor did not turn ON after\n" +
                        "       the specific time.\n" +
                        "       Or, NC was informed of mode of production-setting-test\n" +
                        "       which does not exist.\n" +
                        "       [Code] X\n" +
                        "        1->Concerning check processing of Safety-Speed-Monitor\n" +
                        "           at the time of guard-close of production mode, error\n" +
                        "           signal of Safety-Speed-Monitor did not turn it on once\n" +
                        "           within a specific time.\n" +
                        "        2->NC was informed of mode of production-setting-test\n" +
                        "           which does not exist.\n" +
                        "       [Probable Faulty Location]\n" +
                        "        1)Safety-Speed-Monitor or PLC software,Data-file for\n" +
                        "          Safety-Speed-Monitor\n" +
                        "        2)Safety-Speed-Monitor or PLC software");

        ExampleItem MCS_OPERATION_READY_OFF = new ExampleItem("1098", "MCS OPERATION READY OFF",
                "MCS operation ready turns off.\n" +
                        "       [Object] Axis\n" +
                        "       [Code] X\n" +
                        "        Power supply unit status\n" +
                        "        bit7:PSRDY  PSRDY input is ON.\n" +
                        "        bit6:PSRSTS This signal turns ON when PSRDY input turns ON.\n" +
                        "        .\t     This signal turns OFF when PSRDY input turns OFF.\n" +
                        "        .\t     After reset sequence this signal turns ON again.\n" +
                        "        bit5:OPRON  OPRON input is ON.\n" +
                        "        bit4:PWON   PWON input is ON.\n" +
                        "        bit3:DC power ON(DCON) DC power is being supplied.\n" +
                        "        bit2:Operation command bit(DRV)\n" +
                        "        bit1:Not used\n" +
                        "        bit0:Not used");

        ExampleItem RESET_MACHINE_DATA = new ExampleItem("1100", "RESET MACHINE DATA",
                "The backup data caused an error and the factory-set\n" +
                        "       initial data was forciby loaded. Machine data must be\n" +
                        "       set again.\n" +
                        "       [Object]\n" +
                        "        None\n" +
                        "       [Character-string]\n" +
                        "        None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "        XXXX\n" +
                        "          bit 0:SPARE\n" +
                        "          bit 1:HD backup status file\n" +
                        "          bit 2:Low speed NC backup data file\n" +
                        "          bit 3:High speed NC backup data file\n" +
                        "          bit 4:PLC backup data file\n" +
                        "          bit 5:PLC-HMI data file\n" +
                        "          bit 6:Alarm history data file\n" +
                        "          bit 7:PLC axis data file\n" +
                        "          bit 8:POT TOOL data file(M/C only)\n" +
                        "          bit 9:MOP TOOL data file(M/C only)\n" +
                        "          bit10:MOP TOOL Parameter file(M/C only)\n" +
                        "        YYYY\n" +
                        "          1:File read open error\n" +
                        "          2:File read error\n" +
                        "          3:Version check error\n" +
                        "          4:Check sum error\n" +
                        "          5:Double check sum error\n" +
                        "          6:Backup memory check error\n" +
                        "          7:File write open error\n" +
                        "          8:File write error");

        ExampleItem BLUE_SCREEN = new ExampleItem("1101", "BLUE SCREEN",
                "Blue screen(kernel stop error)occurred.\n" +
                        "       [Object]\n" +
                        "       None\n" +
                        "       [Character-string]\n" +
                        "       None\n" +
                        "       [Code]\n" +
                        "       None\n" +
                        "       [ Probable Faulty Locations ]\n" +
                        "       1.Win32 application failure\n" +
                        "       2.Windows failure\n" +
                        "       3.Windows driver faliure");

        ExampleItem P100_MENU_ERROR = new ExampleItem("1102", "P100-MENU ERROR",
                "An abnormal condition of P100-Menu was detected.\n" +
                        "       [Object]\n" +
                        "       None\n" +
                        "       [Character-string]\n" +
                        "       None\n" +
                        "       [Code]\n" +
                        "       None\n" +
                        "       [ Probable Faulty Locations ]\n" +
                        "       1.P100-Menu failure");

        ExampleItem ALARM_SERVICE_INTENAL_ERROR = new ExampleItem("1103", "ALARMSERVICE INTENAL ERROR",
                "An error occurred inside of AlarmService.\n" +
                        "       [Object]\n" +
                        "       None\n" +
                        "       [Character-string]\n" +
                        "       \"ALMS\"\n" +
                        "       [Code]\n" +
                        "       AlarmService internal error code\n" +
                        "       [ Probable Faulty Locations ]\n" +
                        "       1.NC software failure\n" +
                        "       2.P100-Menu failure");

        ExampleItem DEVICE_NET_SLAVE_IDLE_MODE = new ExampleItem("1104", "DEVICENETSLAVE IDLE MODE",
                "DeviceNet slave station was in idle condition.\n" +
                        "       [Object]\n" +
                        "       None\n" +
                        "       [Character-string]\n" +
                        "       CH*SC$\n" +
                        "        *:Channel number where the error occurred\n" +
                        "        $:Sequence counter\n" +
                        "       [Code]\n" +
                        "       XXYYZZZZ\n" +
                        "       XX MacID of idle condition slave station\n" +
                        "       YY Error status of slave station XX\n" +
                        "        0x00:Normal or nonexistent slave station\n" +
                        "        0x46:Duplicate MacID error\n" +
                        "        0x48:Communication stop\n" +
                        "        0x49:Discrimination information was not compatible with\n" +
                        "             scan list\n" +
                        "        0x4D:Data size not compatible with scan list\n" +
                        "        0x4E:No response in the connection check\n" +
                        "        0x4F:Other slave stations are nonexistence on network\n" +
                        "        0x50:Idle mode condition\n" +
                        "        0x53:Error received in the connection check\n" +
                        "        0x54:Timeout occurred in the connection check\n" +
                        "        0x56:Turn into idle mode\n" +
                        "        0x5B:Bus off\n" +
                        "        0x5C:Network power supply off\n" +
                        "         (XXYY become 0xFFFF,if its not caused by slave station,\n" +
                        "         such as communication delay.)\n" +
                        "       ZZZZ:Scanner error status\n" +
                        "        bit0:Memory check error(when memory initialized)\n" +
                        "        bit1:Scan list initialize error\n" +
                        "        bit2:Scan list mismatch error(MacID)\n" +
                        "        bit3:Scan list mismatch error(Input data)\n" +
                        "        bit4:Scan list mismatch error(output data)\n" +
                        "        bit5:Duplicate MacID error\n" +
                        "        bit6:Network power supply status error\n" +
                        "        bit7:Memory parity error\n" +
                        "        bit8:Input data reception error(single)\n" +
                        "        bit9:Input data reception error(double)\n" +
                        "        bit10:Output data transmission error(single)\n" +
                        "        bit11:Output data transmission error(double)\n" +
                        "        bit12:Slave station communication delay error(single)\n" +
                        "        bit13:Slave station communication delay error(double)\n" +
                        "        bit14:Bus off\n" +
                        "        bit15:Diagnostic information access error\n" +
                        "       [ Probable Faulty Locations ]\n" +
                        "       1.Hardware failure\n" +
                        "       2.Software failure");

        ExampleItem DTL_ERROR = new ExampleItem("1105", "DTL ERROR",
                "A DTL error was detected.\n" +
                        "       [Object]\n" +
                        "       None\n" +
                        "       [ Probable Faulty Locations ]\n" +
                        "       1.Software failure");

        ExampleItem FL_NET_INITIAL_ERROR = new ExampleItem("1106", "FL NET INITIAL ERROR",
                "An error occurred during initialization of FL-net.\n" +
                        "       [Object]\n" +
                        "       None\n" +
                        "       [Character-string]\n" +
                        "       None\n" +
                        "       [Code]\n" +
                        "       None\n" +
                        "       [ Probable Faulty Locations ]\n" +
                        "       FL-net communication parameters are wrong.\n" +
                        "       [ Measures to Take]\n" +
                        "       Start up the FL-net Monitor tool and check the initial \n" +
                        "       parameter data.\n" +
                        "       Then, set the correct communication parameters before \n" +
                        "       restarting the FL-net. ");

        ExampleItem IMPORTANT_ILLEGAL = new ExampleItem("1107", "IMPORTANT ILLEGAL",
                "A serious error occurred during startup of the FL-net card.\n" +
                        "       [Object]\n" +
                        "       None\n" +
                        "       [Character-string]\n" +
                        "       None\n" +
                        "       [Code]\n" +
                        "       Y000XXXX\n" +
                        "       When Y=0, XXXX=7F00 System error\n" +
                        "       \t       7F01 Flash memory error\n" +
                        "       \t       7F02 DRAM test error\n" +
                        "       \t       7F03 NICE test error\n" +
                        "       \t       7F04 EEPROM sum check error\n" +
                        "       \t       7F05 CPU BUS error\n" +
                        "       \t       7F06 Illegal instruction\n" +
                        "       If Y=1, XXXX = 4000. Timeout error of 4 sec or longer\n" +
                        "       If Y=2, XXXX : CommonMemory busy count\n" +
                        "           When Y=3, XXXX=State of self node\n" +
                        "       \t\tbit 3: Double detection of common memory \n" +
                        "       \t\t       bit address\n" +
                        "       \t\tbit 4: Double detection of common memory \n" +
                        "       \t\t       word address\n" +
                        "       \t\tbit 6: Token monitor timeout error\n" +
                        "       \t\tbit 7: Double detection of self node number\n" +
                        "       [ Probable Faulty Locations ]\n" +
                        "       FL-net card is defective.");

        ExampleItem NON_ANSWERED_SOFTWARE_WAS_DETECTED = new ExampleItem("1108", "NON-ANSWERED SOFTWARE WAS DETECTED",
                "[Object]\n" +
                        "       None\n" +
                        "       [Character-string]\n" +
                        "       None\n" +
                        "       [Code]\n" +
                        "       It means a name of Non-answered software by ASCII.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       NC software");

        ExampleItem THE_ERROR_OCCURRED_WHILE_CAS_WORK = new ExampleItem("1109", "THE ERROR OCCURRED WHILE CAS WORK",
                "A virtual machine is controlled with the CAS software. \n" +
                        "       The error occurred by processing this CAS software. \n" +
                        "       Under such a condition, the processing of the interference \n" +
                        "       detection and the model display, etc. is not done\n" +
                        "       [Character-string]\n" +
                        "       None\n" +
                        "       [Code]\n" +
                        "       The return value from the CAS software is indicated.\n" +
                        "       [ Expected faulty point ]\n" +
                        "       Abnormality and the damage, etc. of 3D model data are \n" +
                        "       thought. \n" +
                        "       [ Treatment measures ]\n" +
                        "       The collision avoidance function is invalid though the\n" +
                        "       pulsefeed in the state to push \"Interlock release\" button\n" +
                        "       is possible  by the deletion of the alarm by NC reset even\n" +
                        "       if this alarm  is generated. \n" +
                        "       It is necessary to turn on the power supply again once \n" +
                        "       to make the collision avoidance function effective. \n" +
                        "       Please inquire of our service if the phenomenon relapses.");

        ExampleItem PLC_CONTROL_ERROR = new ExampleItem("1110", "PLC CONTROL ERROR",
                "An error has occurred in the PLC Control.\n" +
                        "       [Index]\n" +
                        "       None\n" +
                        "       [Character-string]\n" +
                        "       None\n" +
                        "       [Code]\n" +
                        "       XXXXYYYY\n" +
                        "       XXXX: Status of PLC Control\n" +
                        "       YYYY: Error code of PLC Control\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       PLC software failure");

        ExampleItem SHUTTING_DOWN_TO_AVOID_DAMAGE = new ExampleItem("1111", "SHUTTING DOWN TO AVOID DAMAGE",
                "The system shut down to avoid the damage of instruments\n" +
                        "       because the data from sensor indicate that the instruments may\n" +
                        "       be influenced.\n" +
                        "       [Object]\n" +
                        "       None\n" +
                        "       [Character-string]\n" +
                        "       None\n" +
                        "       [Code]\n" +
                        "       Sensor identifier\n" +
                        "       20101->CPU temperature\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Cooling system for panel computer unit");

        ExampleItem A_NON_FUNCTIONING_INSTRUMENT_IS_DETECTED = new ExampleItem("1112", "A NON-FUNCTIONING INSTRUMENT IS DETECTED",
                "The system found a non-functioning instrument. But the\n" +
                        "       installed software does not know about details of the\n" +
                        "       instrument.\n" +
                        "       [Object]\n" +
                        "       None\n" +
                        "       [Character-string]\n" +
                        "       None\n" +
                        "       [Code]\n" +
                        "       Non-functioning instrument. \n" +
                        "       [Probable Faulty Locations]\n" +
                        "       [Measures to Take]");

        ExampleItem MCS_PARAMETER_LEARNING_ERROR = new ExampleItem("1113", "MCS PARAMETER LEARNING ERROR",
                "An error occurred in the correction parameter learning.\n" +
                        "       [Object]\n" +
                        "       SYSTEM\n" +
                        "       [Code]\n" +
                        "       1->G266 was commanded when the spindle is rotating.\n" +
                        "       2->Parameter learning broke.\n" +
                        "       3->The parameter learning result is inappropriate.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Programming error\n" +
                        "       Faulty MCS controller");

        ExampleItem MCS_INERTIA_IDENTIFICATION_ERROR = new ExampleItem("1114", "MCS INERTIA IDENTIFICATION ERROR",
                "An error occurred in the spindle inertia identification.\n" +
                        "       [Object]\n" +
                        "       None\n" +
                        "       [Code]\n" +
                        "       1->It was executed when the spindle is rotating.\n" +
                        "       2->It was executed at the function generation.\n" +
                        "       3->Time over.\n" +
                        "       4->Inertia identification broke.\n" +
                        "       5->The identification result error.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty MCS controller");

        ExampleItem OVERLOAD_DETECTED = new ExampleItem("1120", "OVERLOAD DETECTED",
                "Overload of External motor was detected in \"GENERAL OVERLOAD\n" +
                        "       DETECT\"\n" +
                        "       [Object]\n" +
                        "       Case Parallel 2 spindle : Machine system\n" +
                        "       Case Other\t\t: None\n" +
                        "       [Character-string]\n" +
                        "       Refer to General overload detection monitor\n" +
                        "       [Code]\n" +
                        "       1-8 : External motor\n" +
                        "       [Probable Faulty Location]\n" +
                        "       External motor 1 to 8");

        ExampleItem PSC_OPTICAL_SCALE_ENCODER_ERROR = new ExampleItem("1121", "PSC OPTICAL SCALE ENCODER ERROR",
                "An error was detected by the position encoder of optical scale.\n" +
                        "       [Character-string]None\n" +
                        "       [Code]XXYYZZ\n" +
                        "       XX:Value of the J-type endoder and value of the optical scale\n" +
                        "          are too different.\n" +
                        "         bit1:It is too different by a negative sign.\n" +
                        "         bit0:It is too different by a positive sign.\n" +
                        "       YY:Pulse count value of optical scale\n" +
                        "         bit0:A-phase pulse and B-phase pulse have changed at the same\n" +
                        "         time.\n" +
                        "       ZZ:The amplitude of the optical scale signal is wrong.\n" +
                        "         bit1:The amplitude of B-phase is wrong.\n" +
                        "         bit0:The amplitude of A-phase is wrong.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Breakdown of optical scale\n" +
                        "       - Breakdown of optical scale cable\n" +
                        "       [Measures to Take]\n" +
                        "       - Exchange of optical scale\n" +
                        "       - Exchange of optical scale cables");

        ExampleItem SAFETY_CONTROLLER_ERROR = new ExampleItem("1122", "SAFETY CONTROLLER ERROR",
                "An error occurred in the safety controller.\n" +
                        "       [Object]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]\n" +
                        "        1->Machine operation power control failure\n" +
                        "        2->Axis power control failure\n" +
                        "        3->Safety speed monitor failure\n" +
                        "        4->Operation mode failure\n" +
                        "        5->Enabling switch failure\n" +
                        "        6->Robot/Loader IF safety fence input failure\n" +
                        "        7->Robot/Loader IF enabling switch failure\n" +
                        "        8->Tool clamp condition failure\n" +
                        "        9->Work clamp condition failure\n" +
                        "        A->Safety protocol failure\n" +
                        "        B->Motor magnet failure\n" +
                        "        C->Emergency stop button failure\n" +
                        "        D->Emergency stop output failure\n" +
                        "        E->Front door mechanical lock switch failure\n" +
                        "        F->2nd Front door mechanical lock switch failure\n" +
                        "       10->Operator door mechanical lock switch failure\n" +
                        "       11->Spindle cover mechanical lock switch failure\n" +
                        "       12->Door output failure\n" +
                        "       13->Magazine door 1 mechanical lock switch failure\n" +
                        "       14->Magazine door 2 mechanical lock switch failure\n" +
                        "       15->Safety fence mechanical lock switch failure\n" +
                        "       16->Safety fence close confirmation output failure\n" +
                        "       17->Front door safety rubber switch failure\n" +
                        "       18->The parallel / series of machine control power \n" +
                        "           output circuit of hardware is mismatched for software\n" +
                        "       19->Pendant arm limit switch failure\n" +
                        "       1A->2nd door output failure\n" +
                        "       1B->2nd operation mode failure\n" +
                        "       1C->Ladder bar limit switch failure\n" +
                        "       1D->Work table area sensor input failure\n" +
                        "       1E->Side shutter input failure \n" +
                        "       1F->Bar support IF spindle rotation failure\n" +
                        "       20->Bar support IF external guard input failure\n" +
                        "       21->Operator door output failure\n" +
                        "       22->APC door input failure\n" +
                        "       23->Pallet clamp condition failure\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        - The switche which is displayed with above code is broken.\n" +
                        "        - Safety controller");

        ExampleItem SAFETY_SPEED_MONITOR_ERROR_1123 = new ExampleItem("1123", "SAFETY SPEED MONITOR ERROR",
                "An error occurred in the safety speed monitor.\n" +
                        "       [Object]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]\n" +
                        "       0x61XX0000->Speed over\n" +
                        "         XX=Axis number of the target axis\n" +
                        "       0x62XX0000->Parameter setting error\n" +
                        "         XX=Axis number of the target axis\n" +
                        "       0x63XX0000->Machine operation mode error\n" +
                        "         XX=Axis number of the target axis\n" +
                        "       0x64XXYYYY->Safety position frame diagnosis error (Encoder axis)\n" +
                        "         XX=Axis number of the target axis\n" +
                        "         YY=Error information from safety speed monitor\n" +
                        "           bit11->Refresh check error\n" +
                        "           bit10->CRC error\n" +
                        "           bit9 ->Safety frame CRC error\n" +
                        "           bit4 ->Excitation stop was detected\n" +
                        "           bit3 ->CPU error\n" +
                        "           bit2 ->Pulse count error\n" +
                        "           bit1 ->Modulation code error\n" +
                        "           bit0 ->Source address or destination address error\n" +
                        "       0x65XXYYYY->Safety position frame diagnosis error\n" +
                        "       \t\t (Magnet encoder / PG axis)\n" +
                        "         XX=Axis number of the target axis\n" +
                        "         YY=Error information from safety speed monitor\n" +
                        "           bit7 ->Actual speed was mismatch between counter 1\n" +
                        "       \t\t  and counter 2\n" +
                        "           bit4 ->CRC error\n" +
                        "           bit3 ->Refresh check 2 error\n" +
                        "           bit2 ->Refresh check 1 error\n" +
                        "           bit1 ->Counter 2 pulse input error\n" +
                        "           bit0 ->Counter 1 pulse input error\n" +
                        "       0x66XX0000->Axis exchanging error\n" +
                        "         XX=Axis number of the target axis\n" +
                        "       0x67XX0000->Stop monitoring displacement distance over\n" +
                        "         XX=Axis number of the target axis\n" +
                        "       0x68XX0000->Max speed over \n" +
                        "         XX=Axis number of the target axis\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        - Safety speed monitor\n" +
                        "        - Safety speed monitor data file");

        ExampleItem VDU_COMMUNICATION_ERROR = new ExampleItem("1132", "VDU COMMUNICATION ERROR",
                "An error occurred in the VDU(Vibration Detect Unit)\n" +
                        "       communication link, disabling the VDU \n" +
                        "       from detecting acceleration.\n" +
                        "       [Object]Axis name or none (spindle)\n" +
                        "       [Character-string]NONE\n" +
                        "       [Code]XXYYZZZZ\n" +
                        "       XX = FF [HEX] (fixed)\n" +
                        "       YY = 00 [HEX] (fixed)\n" +
                        "       ZZZZ = VDU link error status at the time of error detection.\n" +
                        "       (Each bit represents the kind of communication error.)\n" +
                        "        bit 15 Undefined\n" +
                        "        bit 14 Undefined\n" +
                        "        bit 13 Undefined\n" +
                        "        bit 12 1: Error in communication with VDU(AT mode)\n" +
                        "        bit 11 1: Error in communication with VDU(MT mode)\n" +
                        "        bit 10 1: Transmission loop error in AT (auto) mode\n" +
                        "        bit 9\t1: Data over error in data receiving part of interface\n" +
                        "        bit 8\tUndefined\n" +
                        "        bit 7\tUndefined\n" +
                        "        bit 6\t1: Modulation code error\n" +
                        "        bit 5\t1: CRC error\n" +
                        "        bit 4\t1: Format error\n" +
                        "        bit 3\t1: Double transmission error\n" +
                        "        bit 2\t1: Double reception error\n" +
                        "        bit 1\t1: Modulation code error\n" +
                        "        bit 0\t1: Time-out error\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - VDU\n" +
                        "       - Encoder link cables\n" +
                        "       - VFA unit");

        ExampleItem VDU_ERROR = new ExampleItem("1133", "VDU ERROR",
                "The VDU(Vibration Detect Unit) has become unable to\n" +
                        "       detect acceleration data. \n" +
                        "       [Object]Axis name or none (spindle)\n" +
                        "       [Character-string]NONE\n" +
                        "       [Code]XXYYZZZZ\n" +
                        "       XX = VDU error status\n" +
                        "        bit7\t1: Error bit (1 is error)\n" +
                        "        bit6\t1: Empty bit\n" +
                        "        bit5\t1: Latest acceleration data is overflow(Y axis)\n" +
                        "        bit4\t1: Latest acceleration data is overflow(X axis)\n" +
                        "        bit3\t1: Empty bit\n" +
                        "        bit2\t1: Error in communication\n" +
                        "       (toggled detecting each error)\n" +
                        "        bit1\t1: Previous acceleration data is overflow(Y axis)\n" +
                        "        bit0\t1: Previous acceleration data is overflow(X axis)\n" +
                        "       YY = VDU alarm code\n" +
                        "        01: Stop command halt\n" +
                        "        02: Control parameter error\n" +
                        "        07: User parameter check sum error\n" +
                        "        0E: Synchronous miss error\n" +
                        "        15: Acceleration sensor signal error (X axis)\n" +
                        "        16: Acceleration sensor signal error (Y axis)\n" +
                        "        17: Acceleration sensor signal error (X and Y axis)\n" +
                        "       ZZZZ= 0 (fixed)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - VDU");

        ExampleItem VDU_INITIALIZE_FAILED = new ExampleItem("1134", "VDU INITIALIZE FAILED",
                "An error occurred in initialization of\n" +
                        "       VDU(Vibration Detect Unit).\n" +
                        "       [Object]Axis name or none (spindle)\n" +
                        "       [Character-string]NONE\n" +
                        "       [Code]XXYYZZZZ\n" +
                        "       XX = Encoder link sequence number\n" +
                        "            at the time of error detection\n" +
                        "        0: Reset\n" +
                        "        1: Network address setting\n" +
                        "        2: Request of basic information on communication\n" +
                        "        3: Change of communication version\n" +
                        "        4: Acquisition of device information\n" +
                        "        5: Parameter change\n" +
                        "        6: AT (auto) mode start\n" +
                        "       YY = Error content\n" +
                        "        0: Communication error\n" +
                        "        1: Transmission start time over\n" +
                        "        2: Transmission finishes time over\n" +
                        "        3: Reception finishes time over\n" +
                        "        4: Abnormal response address\n" +
                        "        5: Abnormal response code\n" +
                        "        6: Parameter error\n" +
                        "       ZZZZ = Additional data\n" +
                        "        If YY=0,\n" +
                        "         the encoder link error status C2ERR at the\n" +
                        "         time of error detection appears.\n" +
                        "        If YY=1, 2, or 3,\n" +
                        "         the transferred frame information C2MTINF appears.\n" +
                        "        If YY=4,\n" +
                        "         the network address of the responding device appears.\n" +
                        "        If YY=5,\n" +
                        "         the received frame information C2RXINF appears.\n" +
                        "        If YY=6,\n" +
                        "         the number of parameter that caused the alarm appears.\n" +
                        "          1 = Not all the necessary parameters are received.\n" +
                        "          2 = Basic information on communication is incompatible.\n" +
                        "          4 = Protocol version on communication is incompatible.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - VDU\n" +
                        "       - Encoder link cables\n" +
                        "       - VFA unit");

        ExampleItem MCS_DD_ENCODER_LINK_ERROR = new ExampleItem("1135", "MCS DD ENCODER-LINK ERROR",
                "An error occurred in the encoder communication link.\n" +
                        "       [Object]\n" +
                        "        Axis name or none (spindle)\n" +
                        "       [Character-string]\n" +
                        "        None\n" +
                        "       [Code] XXYYZZZZ\n" +
                        "        XX = $FF (fixed)\n" +
                        "        YY = $00: Error is detected at the DD encoder.\n" +
                        "             $01: Error is detected at the \n" +
                        "       \t\t DD encoder(slave sensor).\n" +
                        "        ZZZZ = Encoder link error status at the\n" +
                        "       \t\t\t      time of error detection\n" +
                        "       \tbit15: Undefined\n" +
                        "       \tbit14: Undefined\n" +
                        "       \tbit13: Error in communication with the DD encoder\n" +
                        "       \t\t(slave sensor)\n" +
                        "       \tbit12: Error in communication with the DD encoder\n" +
                        "       \tbit11: MT buffer error\n" +
                        "       \tbit10: Transmission loop error in AT mode\n" +
                        "       \tbit9 : Data over error in data receiving part of\n" +
                        "       \t       interface\n" +
                        "       \tbit8 : Undefined\n" +
                        "       \tbit7 : Undefined\n" +
                        "       \tbit6 : Modulation code error\n" +
                        "       \tbit5 : CRC error\n" +
                        "       \tbit4 : Format error\n" +
                        "       \tbit3 : Double transmission error\n" +
                        "       \tbit2 : Double reception error\n" +
                        "       \tbit1 : Parity error\n" +
                        "       \tbit0 : Time-out error\n" +
                        "        This alarm occurs only at ICB-H.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        DD encoder of DD encoder (slave sensor) of the pertinent axis\n" +
                        "        Encoder link cables or connectors\n" +
                        "        Inverter unit control board");

        ExampleItem MCS_DD_ENCODER_ERROR = new ExampleItem("1136", "MCS DD ENCODER ERROR",
                "The DD encoder has become undetectable.\n" +
                        "       [Object]\n" +
                        "        Axis name or none (spindle)\n" +
                        "       [Character-string]\n" +
                        "        None\n" +
                        "       [Code] XXYYZZZZ\n" +
                        "        XX = Positional data status\n" +
                        "             bit7  : Error bit (1:error)\n" +
                        "             bit6  : Absolute position sensor margin error\n" +
                        "             .       (0:Normal, 1:Warning)\n" +
                        "             bit5  : Gap-Warning (1:Gap-small,Toggle:Gap-big)\n" +
                        "             bit4  : Inclination-Warning (1:CCW-big, Toggle:CW-big)\n" +
                        "             bit3  : Auto set mode (0:Normal, 1:Auto mode)\n" +
                        "             bit2  : Communication error (Toggle by detecting)\n" +
                        "             bit1,0: Error bit number of absolute position code\n" +
                        "             .       (It is indicated by 2bits.)\n" +
                        "        YY = Alarm code\n" +
                        "             01: Stop command has stopped.\n" +
                        "             02: Control parameter error\n" +
                        "             04: Absolutization error\n" +
                        "             05: Initialization speed too high\n" +
                        "             08: Auto-set-data error\n" +
                        "             0D: Speed too high\n" +
                        "             0E: Synchronization error\n" +
                        "             20: Absolutization mismatch (Only Format-5)\n" +
                        "             21: Communication-error of Master-sensor (Only Format-5)\n" +
                        "             3E: Code-error by Absolute-position-sensor\n" +
                        "             3F: Check-errotr by Absolute-position-code\n" +
                        "             40: Inclination-error (for plus)\n" +
                        "             41: Inclination-error (for minus)\n" +
                        "             42: Gap is narrow\n" +
                        "             43: Gap is wide\n" +
                        "        ZZZZ = 0000 fixed\n" +
                        "        This alarm occurs only at ICB-H.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        DD encoder");

        ExampleItem MCS_DD_ENCODER_SLAVE_SENSOR_ERROR = new ExampleItem("1137", "MCS DD ENCODER (SLAVE SENSOR) ERROR",
                "The DD encoder (slave sensor) has become undetectable.\n" +
                        "       [Object]\n" +
                        "        Axis name or none (spindle)\n" +
                        "       [Character-string]\n" +
                        "        None\n" +
                        "       [Code] XXYYZZZZ\n" +
                        "        XX = Positional data status\n" +
                        "             bit7  : Error bit (1:error)\n" +
                        "             bit6  : Absolute position sensor margin error\n" +
                        "             .       (0:Normal, 1:Warning)\n" +
                        "             bit5  : Gap-Warning (1:Gap-small,Toggle:Gap-big)\n" +
                        "             bit4  : Inclination-Warning (1:CCW-big, Toggle:CW-big)\n" +
                        "             bit3  : Auto set mode (0:Normal, 1:Auto mode)\n" +
                        "             bit2  : Communication error (Toggle by detecting)\n" +
                        "             bit1,0: Error bit number of absolute position code\n" +
                        "             .       (It is indicated by 2bits.)\n" +
                        "        YY = Alarm code\n" +
                        "             01: Stop command has stopped.\n" +
                        "             02: Control parameter error\n" +
                        "             04: Absolutization error\n" +
                        "             05: Initialization speed too high\n" +
                        "             08: Auto-set-data error\n" +
                        "             0D: Speed too high\n" +
                        "             0E: Synchronization error\n" +
                        "             20: Absolutization mismatch (Only Format-5)\n" +
                        "             21: Communication-error of Master-sensor (Only Format-5)\n" +
                        "             3E: Code-error by Absolute-position-sensor\n" +
                        "             3F: Check-errotr by Absolute-position-code\n" +
                        "             40: Inclination-error (for plus)\n" +
                        "             41: Inclination-error (for minus)\n" +
                        "             42: Gap is narrow\n" +
                        "             43: Gap is wide\n" +
                        "        ZZZZ = 0000 fixed\n" +
                        "        This alarm occurs only at ICB-H.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        DD encoder (slave sensor)");

        ExampleItem MCS_DD_ENCODER_INITIALIZE_FAILED = new ExampleItem("1138", "MCS DD ENCODER INITIALIZE FAILED",
                "An error occurred in the initialization of the DD encoder.\n" +
                        "       [Object]\n" +
                        "       Axis name or none (spindle)\n" +
                        "       [Character-string]\n" +
                        "       None\n" +
                        "       [Code] XXYYZZZZ\n" +
                        "        XX = Encoder link initialization sequence number (1B) \n" +
                        "             at the time of the error detection\n" +
                        "              0: Reset\n" +
                        "              1: Network address setting\n" +
                        "              2: Request to send the basic information for communication\n" +
                        "              3: Change of communication software version\n" +
                        "              4: Acquisition of device information\n" +
                        "              5: Parameter change\n" +
                        "              6: Position detection start\n" +
                        "              7: AT mode start\n" +
                        "        YY = Error content (1B)\n" +
                        "              0: Communication error\n" +
                        "              1: Transmission start time over\n" +
                        "              2: Transmission finish time over\n" +
                        "              3: Reception finish time over\n" +
                        "              4: Abnormal response address\n" +
                        "              5: Abnormal response code\n" +
                        "              6: Parameter error\n" +
                        "        ZZZZ = Data (2B)\n" +
                        "          If YY = 0,\n" +
                        "             The encoder link error status C2ERR at the time of error\n" +
                        "             detection appears.\n" +
                        "          If YY = 1, 2 or 3,\n" +
                        "             The transmitted frame information QC2MTINF appears.\n" +
                        "          If YY = 4,\n" +
                        "             The network address of the responding device appears.\n" +
                        "          If YY = 5,\n" +
                        "             Alarm code + positional data status\n" +
                        "             Refer to MCS DD Encoder error (alarm 1136).\n" +
                        "          If YY = 6,\n" +
                        "             Parameter number at which the error is detected\n" +
                        "              1: Reception of insufficient number of parameters\n" +
                        "              2: Basic information for communication being incompatible\n" +
                        "              3: Multi-turn detection range over\n" +
                        "              4: Communication protocol version being incompatible\n" +
                        "              5: Positional data format being incompatible\n" +
                        "              6: Abbreviated data mode being incompatible\n" +
                        "        However, when abnormal voltage is detected at the encoder fuse\n" +
                        "          XXYY = $FFFF fixed\n" +
                        "          ZZZZ = Detected voltage value of the encoder fuse\n" +
                        "       \t  (12[V] = $9980)\n" +
                        "       \t  Normal range: 10.6[V] to 13.8[V]\n" +
                        "       \t  Allowable range: $8800 to $B000\n" +
                        "        This alarm occurs only at ICB-H.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        DD encoder\n" +
                        "        Encoder link cables and connectors\n" +
                        "        Inverter unit control board");

        ExampleItem MCS_DD_ENCODER_SLAVE_SENSOR_INITIALIZE_FAILED = new ExampleItem("1139", "MCS DD ENCODER (SLAVE_SENSOR) INITIALIZE FAILED",
                "An error occurred in the initialization of the DD encoder\n" +
                        "       (slave sensor).\n" +
                        "       [Index]\n" +
                        "        Axis name or none (spindle)\n" +
                        "       [Character-string]\n" +
                        "        None\n" +
                        "       [Code] XXYYZZZZ\n" +
                        "        XX = Encoder link initialization sequence number (1B) at\n" +
                        "             the time of the error detection\n" +
                        "              0: Reset\n" +
                        "              1: Network address setting\n" +
                        "              2: Request to send the basic information for communication\n" +
                        "              3: Change of communication software version\n" +
                        "              4: Acquisition of device information\n" +
                        "              5: Parameter change\n" +
                        "              6: Position detection start\n" +
                        "              7: AT mode start\n" +
                        "        YY = Error content (1B)\n" +
                        "              0: Communication error\n" +
                        "              1: Transmission start time over\n" +
                        "              2: Transmission finish time over\n" +
                        "              3: Reception finish time over\n" +
                        "              4: Abnormal response address\n" +
                        "              5: Abnormal response code\n" +
                        "              6: Parameter error\n" +
                        "        ZZZZ = Data (2B)\n" +
                        "         If YY = 0,\n" +
                        "            The encoder link error status C2ERR at the time of error\n" +
                        "            detection appears.\n" +
                        "         If YY = 1, 2 or 3,\n" +
                        "            The transmitted frame information QC2MTINF appears.\n" +
                        "         If YY = 4,\n" +
                        "            The network address of the responding device appears.\n" +
                        "         If YY = 5,\n" +
                        "            Alarm code + positional data status\n" +
                        "            Refer to MCS DD Encoder error (alarm 1136).\n" +
                        "         If YY = 6,\n" +
                        "            Parameter number at which the error is detected\n" +
                        "             1: Reception of insufficient number of parameters\n" +
                        "             2: Basic information for communication being incompatible\n" +
                        "             3: Multi-turn detection range over\n" +
                        "             4: Communication protocol version being incompatible\n" +
                        "             5: Positional data format being incompatible\n" +
                        "             6: Abbreviated data mode being incompatible\n" +
                        "        However, when abnormal voltage is detected at the encoder fuse\n" +
                        "          XXYY = $FFFF fixed\n" +
                        "          ZZZZ = Detected voltage value of the encoder fuse\n" +
                        "       \t  (12[V] = $9980)\n" +
                        "       \t  Normal range: 10.6[V] to 13.8[V]\n" +
                        "       \t  Allowable range: $8800 to $B000\n" +
                        "        This alarm occurs only at ICB-H.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        DD encoder (slave sensor)\n" +
                        "        Encoder link cables and connectors\n" +
                        "        Inverter unit control board");

        ExampleItem MCS_POWER_SUPPLY_UNIT_OVER_LOAD = new ExampleItem("1144", "MCS POWER SUPPLY UNIT OVER LOAD",
                "Power Supply Unit over load\n" +
                        "       [Object]\n" +
                        "        Axis name or none (spindle)\n" +
                        "       [Character-string]\n" +
                        "        None\n" +
                        "       [Code]\n" +
                        "        1(fixed)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        Power unit\n" +
                        "        Overload operation");

        ExampleItem TAILSTOCK_TORQUE_OVER = new ExampleItem("1146", "TAILSTOCK TORQUE OVER",
                "Concerning the simple tow-along tailstook specification,\n" +
                        "       it surpassed W axis torque set data Z axis motor torque\n" +
                        "       has set on a systematic parameter by a tailstook\n" +
                        "       connection condition.\n" +
                        "       As it clamped, it was about to move tailstook.\n" +
                        "       [ Probable Faulty Locations ]\n" +
                        "       1) Slide resistance of tailstook Z axis direction is big.\n" +
                        "       2) Tailstook is clamped.");

        ExampleItem MCS_UNDEFINED_ALARM_NUMBER = new ExampleItem("1150", "MCS UNDEFINED ALARM NUMBER",
                "The MCS caused an error related with axis control.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] Alarm number in decimal\n" +
                        "       [Code] Alarm code\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Depends on the number indicated in the character-string.\n" +
                        "         Inform us of the code and the character string.");

        ExampleItem MCS_EXCEPTION_PROCESSING = new ExampleItem("1151", "MCS EXCEPTION_PROCESSING",
                "A fatal alarm occurred while the MCS invertor unit and\n" +
                        "       MCS software are executing their processing.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] Cause of alarm detected\n" +
                        "       \"#1\"-> Control board error\n" +
                        "       \"#2\"-> Voltage drop of +-12 V battery for control board\n" +
                        "       \"#3\"-> OPF error\n" +
                        "       \"#11\"-> Voltage drop of 5 V battery for control board\n" +
                        "       \"#12\"-> Invertor bridge shorted\n" +
                        "       \"#13\"-> IPM protective function activated\n" +
                        "       \"#14\"-> Motor overcurrent\n" +
                        "       \"#20\"-> INT loop error\n" +
                        "       \"#21\"-> INT5 loop error\n" +
                        "       \"#22\"-> INT4 loop error\n" +
                        "       \"#23\"-> INT3 loop error\n" +
                        "       \"#24\"-> INT2 loop error\n" +
                        "       \"#25\"-> INT1 loop error\n" +
                        "       \"#26\"-> Access denied\n" +
                        "       \"#27\"-> Ram check error in initialization\n" +
                        "       \"#28\"-> Party error\n" +
                        "       \"#29\"-> Watchdog error\n" +
                        "       \"#30\"-> IRQ7 interruption\n" +
                        "       \"#31\"-> NMI interruption\n" +
                        "       \"#32\"-> General illegal command\n" +
                        "       \"#33\"-> Slot illegal command\n" +
                        "       \"#34\"-> CPU address error\n" +
                        "       \"#35\"-> DMA address error\n" +
                        "       \"#36\"-> Undefined trap error\n" +
                        "       \"#37\"-> Undefined interruption\n" +
                        "       \"#38\"-> DMAC\n" +
                        "       \"#39\"-> ITU\n" +
                        "       \"#40\"-> SCI\n" +
                        "       \"#41\"-> REF\n" +
                        "       \"#42\"-> A/D\n" +
                        "       \"#43\"-> System reserved\n" +
                        "       \"#44\"-> User break\n" +
                        "       [Code]\n" +
                        "       In the case of #1, the code shows the error content of\n" +
                        "       the control board.\n" +
                        "       In the case of #3, the code shows the error content of\n" +
                        "       the optional program file.\n" +
                        "        1: Identification code \"OPF1\" error\n" +
                        "        2: End code \"ED\" error\n" +
                        "        3: Sum check error\n" +
                        "        4: Board name error\n" +
                        "       In the case of #11-14, #20-21, #25-26 and #30-31, \n" +
                        "       the code shows the data in the error status register.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       In the case of #1,\n" +
                        "        - Invertor unit\n" +
                        "       In the case of #3,\n" +
                        "        - Optional program file\n" +
                        "        - Optional program file incompatible with invertor unit\n" +
                        "       In the case of #2 or #11,\n" +
                        "        - Power unit (when this alarm occurred in several \n" +
                        "          invertor units)\n" +
                        "       In the case of #12, #13, or #14,\n" +
                        "        - Invertor unit\n" +
                        "       In other cases,\n" +
                        "        - Invertor unit");

        ExampleItem MCS_PROCESSING_TROUBLE = new ExampleItem("1152", "MCS PROCESSING TROUBLE",
                "MCS\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXZZAAAA\n" +
                        "       XX:\n" +
                        "        04...The self-diagnostic data has an error. \n" +
                        "             (ZZ: Received data)\n" +
                        "        06...Software sync bit or format code of buffer A is wrong.\n" +
                        "        07...Software sync bit or format code of buffer B is wrong.\n" +
                        "        08...An error occurred in data communication.\n" +
                        "       ZZ shows the data kind. AAAA is always 0.\n" +
                        "       ZZ:\n" +
                        "        1...Speed command (8408)\n" +
                        "        2...Laser linear scale value (4413)\n" +
                        "        3...Backlash (4406)\n" +
                        "        4...Actual position without positioning error compensation\n" +
                        "            (440A)\n" +
                        "        5...Positioning error compensation amount\n" +
                        "        6...Full-closed loop encoder value (4410)\n" +
                        "        7...Semi-closed loop encoder value (4411)\n" +
                        "        8...ODIFF (4415)\n" +
                        "        10..APA in divided stroke (4404)\n" +
                        "        11..Acceleration/deceleration time for positioning (4422)\n" +
                        "        12..Zero offset amount\n" +
                        "        13..In-position width (4420)\n" +
                        "        14..Maximum of divided stroke (4405)\n" +
                        "        15..Point data change\n" +
                        "        16..Positioning command format (1411)\n" +
                        "        17..Speed integrating factor effective (0431)\n" +
                        "        18..Encoder data (861B)\n" +
                        "        19..Speed mode acceleration unit amount (440D)\n" +
                        "        20..CON for MCS (4419)\n" +
                        "        24..Encoder data (861B)\n" +
                        "        25..Encoder zero offset (4418)\n" +
                        "        26..Variable lost motion (0437,2413,4437-443D)\n" +
                        "        27..Correction parameter learning (2457,2458,2647,2648)\n" +
                        "        28..Spindle inertia identification (2459,2647,2648,442A)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Faulty MCS controller\n" +
                        "       - Faulty software");

        ExampleItem MCS_CON_APA_DEVIATION = new ExampleItem("1153", "MCS_CON_APA_DEVIATION",
                "Difference between CON and APA values has exceeded the\n" +
                        "       allowable limit. The CON-APC deviation is the absolute\n" +
                        "       value of difference between [calculated value written \n" +
                        "       in MCS] and [actual position read from MCS]. \n" +
                        "       The NC control software monitors this deviation. \n" +
                        "       The MCS normally monitors DIFF value.\n" +
                        "       This alarm appears if the MCS causes a fatal error and\n" +
                        "       cannot monitor the DIFF value.\n" +
                        "       [Object] Axis name\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Absolute value of deviation in hexadecimal (reference\n" +
                        "       unit)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Faulty MCS controller\n" +
                        "       - Mismatch between MCS data and NC data");

        ExampleItem MCS_POWER_SUPPLY_UNIT_ERROR = new ExampleItem("1154", "MCS POWER SUPPLY UNIT ERROR",
                "The power unit caused an error.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] AAAAAAXX\n" +
                        "       AAAAAA is always 0.\n" +
                        "       X Alarm number\n" +
                        "        0:DC voltage alarm\n" +
                        "        1:Abnormal input voltage\n" +
                        "        2:Abnormal control power\n" +
                        "        3:Abnormal control status\n" +
                        "        4:Overload in regenerative circuit\n" +
                        "        5:Heat sink overheat\n" +
                        "        6:CPU error\n" +
                        "        7:Spare\n" +
                        "       Y: Power unit status\n" +
                        "        bit3 1:An alarm occurred in the power unit. (Warning\n" +
                        "       \tsignal status: 0)\n" +
                        "        bit2 1:DC power is being supplied\n" +
                        "        bit1 1:OPRON input is closed\n" +
                        "        bit0 1:PWON input is closed.\n" +
                        "       ZZ: Data\n" +
                        "        X(alarm No.):0 ... Detected DC voltage in hexadecimal \n" +
                        "       \t\t\t\t\t\t[3.9V]\n" +
                        "        X(alarm No.):1 ... Detected AC voltage in hexadecimal \n" +
                        "       \t\t\t\t\t\t[3.1V]\n" +
                        "        X(alarm No.):2\n" +
                        "         1:+5V abnormal voltage\n" +
                        "         2:+12V abnormal voltage\n" +
                        "         3:-12V abnormal voltage\n" +
                        "        X(alarm No.):3\n" +
                        "         1:Converter over current\n" +
                        "         2:Abnormal power element\n" +
                        "         3:Converter short circut\n" +
                        "         4:Abnormal regenerative circuit(type in power regenerative\n" +
                        "           circuit)\n" +
                        "         5:Abnormal regenerative circuit(type in resistor discharge)\n" +
                        "        X(alarm No.):4 Uncertain\n" +
                        "        X(alarm No.):5 Uncertain\n" +
                        "        X(alarm No.):6 Uncertain\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       In the case of abnormal control power,\n" +
                        "        - Power unit\n" +
                        "       In the case of low voltage,\n" +
                        "        - Input voltage drop, power failure, blown fuse in input\n" +
                        "          power circuit, or instantaneous power interruption\n" +
                        "       In the case of high voltage\n" +
                        "        - Power unit");

        ExampleItem MCS_CONVERTER_LINK_ERROR = new ExampleItem("1155", "MCS CONVERTER-LINK ERROR",
                "The convertor link (used for communication between power\n" +
                        "       unit and invertor unit) caused an error, disabling \n" +
                        "       the NC from monitoring the power unit condition.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code]XAAAAAYY\n" +
                        "       AAAAA is always 0.\n" +
                        "       X=0: communication error\n" +
                        "       X=1: Time-out error (communication interrupted)\n" +
                        "       YY=communication status\n" +
                        "         When X is ONE(1),always 0\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Convertor link cables or connectors\n" +
                        "       - Power unit\n" +
                        "       - Invertor unit control board");

        ExampleItem MCS_DC_BUS_VOLTAGE_ERROR = new ExampleItem("1156", "MCS DC-BUS VOLTAGE ERROR",
                "The DC-bus voltage in the invertor unit has abnormally\n" +
                        "       risen or fallen, disabling the invertor from supplying\n" +
                        "       the current.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "       XXXX= Detected overvoltage in hexadecimal [15.3 mV]\n" +
                        "       YYYY= Detected undervoltage in hexadecimal [15.3 mV]\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       In the case of voltage rise,\n" +
                        "        - Power unit\n" +
                        "       In the case of voltage drop,\n" +
                        "        - Power unit\n" +
                        "        - Invertor unit\n" +
                        "        - Instantaneous power interruption");

        ExampleItem MCS_MOTOR_OVER_CURRENT = new ExampleItem("1157", "MCS MOTOR OVER CURRENT",
                "The invertor unit has detected excessive current flowing\n" +
                        "       in the motor cable.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "       XXXX= U-phase current detected when this alarm occurs,\n" +
                        "             expressed in signed hexadecimal [Tolerance: 3FFF]\n" +
                        "       YYYY= V-phase current detected when this alarm occurs,\n" +
                        "             expressed in signed hexadecimal [Tolerance: 3FFF]\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Invertor unit\n" +
                        "       - Faulty motor insulation");

        ExampleItem MCS_POWER_UNIT_OVER_HEAT = new ExampleItem("1158", "MCS POWER UNIT OVER HEAT",
                "The invertor unit temperature has risen abnormally.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1 (fixed)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Invertor unit\n" +
                        "       - Overload operation");

        ExampleItem MCS_POWER_UNIT_OVER_LOAD = new ExampleItem("1159", "MCS POWER UNIT OVER LOAD",
                "The invertor load has exceeded the specified value, \n" +
                        "       activating the overload protection function.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] YYYYZZZZ\n" +
                        "       YYYY-> Gamma of the protection curve used to detect \n" +
                        "              overload\n" +
                        "       ZZZZ-> Internally calculated overload data\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Invertor unit\n" +
                        "       - Overload operation");

        ExampleItem MCS_SUPPLY_VOLTAGE_FLUTTER = new ExampleItem("1160", "MCS SUPPLY VOLTAGE FLUTTER",
                "The power unit input voltage is abnormally high or low.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Detected abnormal voltage in hexadecimal [Volt]\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Power unit\n" +
                        "       - Power cables or connectors\n" +
                        "       - Instantaneous power interruption");

        ExampleItem MCS_POWER_UNIT_VERSION_ERROR = new ExampleItem("1161", "MCS POWER UNIT VERSION ERROR",
                "The invertor unit allowable current is smaller than the\n" +
                        "       current limit specified in the servo data file.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1 (fixed)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Invertor unit\n" +
                        "       - Servo data file");

        ExampleItem MCS_WINDING_CHANGE_FAILED = new ExampleItem("1162", "MCS WINDING CHANGE FAILED",
                "The winding-change magnet switch does not come on.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] YYYYZZZZ\n" +
                        "       If YYYY = 0000\n" +
                        "        ZZZZ = 0001: Magnet conductor for low-speed winding is ON.\n" +
                        "        ZZZZ = 0002: Magnet conductor for high-speed winding is ON.\n" +
                        "        ZZZZ = 0003: Magnet conductors for both windings are ON.\n" +
                        "        ZZZZ = 0004: Winding change time-out\n" +
                        "       If YYYY = 1010\n" +
                        "        ZZZZ = 0001: Faulty servo data file\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Winding-change magnet switch");

        ExampleItem MCS_ENCODER_LINK_ERROR = new ExampleItem("1163", "MCS ENCODER LINK ERROR",
                "An error occurred in the encoder communication link,\n" +
                        "       disabling the encoder from detecting positioning speed.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXYYZZZZ\n" +
                        "       XX = FF (fixed)\n" +
                        "       YY = 00: YY = 00: Error is detected at the motor encoder.\n" +
                        "            01: Error is detected at the position encoder with\n" +
                        "       \t shaft.\n" +
                        "            02: Error is detected at the independent position\n" +
                        "       \t encoder.\n" +
                        "            03: Error is detected at ABSO SCALE.\n" +
                        "       ZZZZ= Encoder link error status at the time of error \n" +
                        "             detection. Each bit represents the kind of\n" +
                        "             communication error.\n" +
                        "       bit 15\t1: Error in communication with a stand-alone \n" +
                        "       \t   encoder\n" +
                        "       bit 14\t1: Error in communication with ABSO SCALE 2\n" +
                        "       bit 13\t1: Error in communication with ABSO SCALE or \n" +
                        "       \t   encoder with shaft\n" +
                        "       bit 12\t1: Error in communication with motor encoder\n" +
                        "       bit 11\t1: Undefined\n" +
                        "       bit 10\t1: Transmission loop error in AT (auto) mode\n" +
                        "       bit 9\t1: Data over error in data receiving part of \n" +
                        "       \t   interface\n" +
                        "       bit 8\t1: Undefined\n" +
                        "       bit 7\t1: Undefined\n" +
                        "       bit 6\t1: Modulation code error\n" +
                        "       bit 5\t1: CRC error\n" +
                        "       bit 4\t1: Format error\n" +
                        "       bit 3\t1: Double transmission error\n" +
                        "       bit 2\t1: Double reception error\n" +
                        "       bit 1\t1: Parity error\n" +
                        "       bit 0\t1: Time-out error\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Motor encoder, ABSO SCALE, encoder with shaft, \n" +
                        "         or stand-alone encoder of the problem axis\n" +
                        "       - Encoder link cables or connectors\n" +
                        "       - Invertor unit control board");

        ExampleItem MCS_ENCODER_ERROR = new ExampleItem("1164", "MCS ENCODER ERROR", "The motor encoder has become unable to detect\n" +
                "       positional data.\n" +
                "       [Object] Axis name or none (spindle)\n" +
                "       [Character-string] None\n" +
                "       [Code] XXYYZZZZ\n" +
                "        XX= Encoder error code depending on the encoder type\n" +
                "        YY = Detailed encoder status. The status varies with\n" +
                "             the encoder type.\n" +
                "        ZZZZ = Multi-turn position data. This data appears when\n" +
                "       \tthe multi-turn\n" +
                "       position data has exceeded the rotating range.\n" +
                "        XX = 0 (fixed)\n" +
                "        YY = 1 (fixed)\n" +
                "        ZZZZ = Multi-turn position data\n" +
                "       [Probable Faulty Locations]\n" +
                "       - Motor encoder");

        ExampleItem MCS_ENCODER_INITIALIZE_FAILED = new ExampleItem("1165", "MCS ENCODER INITIALIZE FAILED",
                "An error occurred in initialization of the motor encoder.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXYYZZZZ\n" +
                        "       XX= Encoder link sequence number at the time of error\n" +
                        "           detection\n" +
                        "        0: Reset\n" +
                        "        1: Network address setting\n" +
                        "        2: Request of basic information on communication\n" +
                        "        3: Change of communication version\n" +
                        "        4: Acquisition of device information\n" +
                        "        5: Parameter change\n" +
                        "        6: AT (auto) mode start\n" +
                        "       YY= Error content\n" +
                        "        0: Communication error\n" +
                        "        1: Transmission start time over\n" +
                        "        2: Transmission finish time over\n" +
                        "        3: Reception finish time over\n" +
                        "        4: Abnormal response address\n" +
                        "        5: Abnormal response code\n" +
                        "        6: Parameter error\n" +
                        "       ZZZZ= Additional data\n" +
                        "        If YY=0, the encoder link error status C2ERR at the time\n" +
                        "              of error detection appears.\n" +
                        "        If YY=1, 2, or 3, the transferred frame information\n" +
                        "              QC2MTINF appears.\n" +
                        "        If YY=4, the network address of the responding device \n" +
                        "              appears.\n" +
                        "        If YY=5, the received frame information QC2RXINF appears.\n" +
                        "        If YY=6, the number of parameter that caused the alarm \n" +
                        "              appears.\n" +
                        "          1= Not all the necessary parameters are received.\n" +
                        "          2= Basic information on communication is incompatible.\n" +
                        "          3= Multi-rotation detection range does not match.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Motor encoder\n" +
                        "       - Encoder link cables or connectors\n" +
                        "       - Invertor unit control board");

        ExampleItem MCS_ENCODER_WITH_SHAFT_ERROR = new ExampleItem("1166", "MCS ENCODER WITH SHAFT ERROR",
                "The encoder with shaft has become unable to detect\n" +
                        "       positional data.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Same with <MCS Encoder error>\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Encoder with shaft");

        ExampleItem MCS_ENCODER_WITH_SHAFT_INITIAL = new ExampleItem("1167", "MCS ENCODER WITH SHAFT INITIAL",
                "An error occurred in initialization of the encoder with\n" +
                        "       shaft.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Same with <MCS Encoder initialize failed>\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Encoder with shaft\n" +
                        "       - Encoder link cables or connectors\n" +
                        "       - Invertor unit control board");

        ExampleItem MCS_ABSO_SCALE_ERROR = new ExampleItem("1168", "MCS ABSO SCALE ERROR",
                "An error occurred in initialization of ABSO SCALE.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - ABSO SCALE    ");

        ExampleItem MCS_ABSO_SCALE_INITIALIZE = new ExampleItem("1169", "MCS ABSO SCALE INITIALIZE",
                "An error occurred in initialization of ABSO SCALE.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Same with <MCS Encoder initialize failed>\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - ABSO SCALE\n" +
                        "       - Encoder link cables or connectors\n" +
                        "       - Invertor unit control board");

        ExampleItem MCS_MAGNETIC_ENCODER_ALARM = new ExampleItem("1170", "MCS MAGNETIC ENCODER ALARM",
                "The magnetic pulse generator has become unable to detect\n" +
                        "       the motor speed. Or, the number of magnetic encoder gear\n" +
                        "       teeth does not match the data in the MCS data file.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "       XXXX= Error content\n" +
                        "        A->A-phase voltage is abnormal.\n" +
                        "        B->B-phase voltage is abnormal.\n" +
                        "        C->Magnetic encoder data error\n" +
                        "        Others-> Servo data file set value detected when the\n" +
                        "       \t  count over error occurred in the magnetic \n" +
                        "       \t  encoder (No. of PG gear teeth * 4 - 1)\n" +
                        "       YYYY= Additional error data (Varies with XXXX.)\n" +
                        "        If XXXX is A, A-phase voltage appears.\n" +
                        "        If XXXX is B, B-phase voltage appears.\n" +
                        "        If XXXX is C, 0 (fixed) appears.\n" +
                        "        Others-> Detected count value of magnetic encoder\n" +
                        "       \t  (No. of PG gear teeth * 4 - 1)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Magnetic encoder or its wiring, or large gap between\n" +
                        "         magnetic encoder and gear\n" +
                        "       - Mismatch between the number of gear teeth of magnetic\n" +
                        "         encoder and the servo data file data");

        ExampleItem MCS_RESOLVER_ALARM = new ExampleItem("1171", "MCS RESOLVER ALARM",
                "The resolver does not send any signal.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] 1 (fixed)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Resolver trouble, or disconnection or contact failure\n" +
                        "         of the resolver cable");

        ExampleItem MCS_PULSE_GENERATOR_ALARM = new ExampleItem("1172", "MCS PULSE GENERATOR ALARM",
                "he PG (pulse generator) count value per one turn differs\n" +
                        "       from the corresponding data specified in servo data file.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "       XXXX= PBU set value (Count number for one PG turn)\n" +
                        "       YYYY= Actual count number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Faulty PG\n" +
                        "       - Mismatch between the number of PG gear teeth and the\n" +
                        "         servo data file data");

        ExampleItem MCS_MOTOR_OVER_HEAT = new ExampleItem("1173", "MCS MOTOR OVER HEAT",
                "The motor temperature is abnormally high.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code]YYYYZZZZ\n" +
                        "       YYYY = 0 (fixed)\n" +
                        "       ZZZZ = 0010: Motor overheat\n" +
                        "       ZZZZ = 0011: Motor overheat is detected at the motor.\n" +
                        "       ZZZZ = 0012: Motor overheat is detected at the position\n" +
                        "       \t     encoder.\n" +
                        "       ZZZZ = 0013: Motor overhead is detected at the motor and\n" +
                        "       \t     the encoder.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Malfunction of VAC motor fan, dirty heat sink, CW/CCW\n" +
                        "         turns and stops at high frequency\n" +
                        "       - BL motor\n" +
                        "       - Motor encoder (BL motor detects overheat by its encoder.)");

        ExampleItem MCS_SERVO_LINK_ERROR = new ExampleItem("1174", "MCS SERVO-LINK ERROR",
                "A communication error occurred in the servo link, disabling\n" +
                        "       the servo unit from receiving commands from the NC.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "       XXXX=0 (fixed)\n" +
                        "       YYYY= Bit number indicating the kind of communication error\n" +
                        "        (Servo link error status at the time of error detection)\n" +
                        "        bit 15  1: 2nd B-buffer error\n" +
                        "        bit 14  1: 2nd A-buffer error\n" +
                        "        bit 13  1: 1st B-buffer error\n" +
                        "        bit 12  1: 1st A-buffer error\n" +
                        "        bit 11  1: MT buffer error\n" +
                        "        bit 10  1: Relay processing error\n" +
                        "        bit 9\t 1: Data over error in data receiving part of \n" +
                        "       \t    interface\n" +
                        "        bit 8\t 1: Disconnection\n" +
                        "        bit 7\t 1: Address pointer error\n" +
                        "        bit 6\t 1: Modulation code error\n" +
                        "        bit 5\t 1: CRC error\n" +
                        "        bit 4\t 1: Format error\n" +
                        "        bit 3\t 1: Double transmission error\n" +
                        "        bit 2\t 1: Double reception error\n" +
                        "        bit 1\t 1: Parity error\n" +
                        "        bit 0\t 1: Time-out error\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Invertor unit control board\n" +
                        "       - Servo link cables or connectors\n" +
                        "       - FCP board");

        ExampleItem MCS_SERVO_LINK_DISCONNECT = new ExampleItem("1175", "MCS SERVO LINK DISCONNECT",
                "The servo link is disconnected, disabling the servo unit\n" +
                        "       from receiving commands from the NC.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "       XXXX= Disconnected position\n" +
                        "        0...Disconnected right in front of the problem unit\n" +
                        "        8000...Disconnected before the problem unit\n" +
                        "       YYYY= Servo link error status at the time of error \n" +
                        "             detection\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Servo cables or connectors\n" +
                        "       - Invertor unit control board\n" +
                        "       - FCP board");

        ExampleItem MCS_SERVO_LINK_PROTOCOL_ERROR = new ExampleItem("1176", "MCS SERVO-LINK PROTOCOL ERROR",
                "The NC and the invertor unit exchange commands and \n" +
                        "       responses at constant intervals according to the specified \n" +
                        "       protocol through the servo link. In this communication, \n" +
                        "       a wrong protocol or abnormal timing was used to transfer\n" +
                        "       the data from NC to the invertor unit.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Number indicating the error content\n" +
                        "       1: A-buffer Software synchronization error\n" +
                        "       2: A-buffer Format code error\n" +
                        "       3: B-buffer Software synchronization error\n" +
                        "       4: B-buffer Format code error\n" +
                        "       5: B-buffer Block number error\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Invertor unit control board\n" +
                        "       - NC software\n" +
                        "       - Invertor unit control board not compatible with NC \n" +
                        "         software\n" +
                        "       - FCP board");

        ExampleItem MCS_SERVO_DATA_ERROR = new ExampleItem("1177", "MCS SERVO DATA ERROR",
                "The servo data sent from the NC for initialization or\n" +
                        "       operation is not applicable to the invertor unit.\n" +
                        "       If this alarm occurs after change of invertor unit, the\n" +
                        "       servo data file is not applicable to the invertor unit.\n" +
                        "       If this alarm occurs after adjustment or change of the\n" +
                        "       servo data, the servo data is wrongly changed.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "       XXXX= Data ID number of the data that caused the error\n" +
                        "       YY= Data set number of the data that caused the error\n" +
                        "       ZZ= Error content\n" +
                        "        1: Out of setting range\n" +
                        "        2: Wrongly set timing\n" +
                        "        3: No transmission\n" +
                        "        4: Calculation error\n" +
                        "        5: Others\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Servo data file not compatible with invertor unit\n" +
                        "       - Invertor unit not compatible with NC software\n" +
                        "       - Invertor unit control board\n" +
                        "       - NC software");

        ExampleItem MCS_ILLEGAL_COMMAND = new ExampleItem("1178", "MCS ILLEGAL COMMAND",
                "The NC and the invertor unit exchange commands and\n" +
                        "       responses through the servo link. In this communication,\n" +
                        "       the NC sent an abnormal or inexecutable command to the\n" +
                        "       invertor unit.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "       XXXX=\n" +
                        "       10:  Positioning mode  Command point number over\n" +
                        "       11:  Positioning mode  Negative command value\n" +
                        "       12:  Positioning mode  Larger command value\n" +
                        "            (specified position > 360 for rotary axis)\n" +
                        "       13:  Positioning mode  RPositioning point table not\n" +
                        "            transmitted\n" +
                        "       14:  Positioning mode  Non-rotating axis\n" +
                        "       15:  Positioning mode  Command format other than points\n" +
                        "       16:  Positioning mode  Positioning sub-mode error\n" +
                        "       21:  Parameter change  Parameter number out of specifable \n" +
                        "            range\n" +
                        "       22:  Mode  Undefined mode\n" +
                        "       23:  Mode  Positioning/tool path mode condition\n" +
                        "       24:  Coordinate system\tCoordinate system designation error\n" +
                        "       30:  Unused bit is ON in the bit commands for controlling\n" +
                        "            the S-link A buffer.\n" +
                        "       31:  Unused bit is ON among the bit data in the S-link\n" +
                        "            B buffer.\n" +
                        "       40:  AT mode is selected without reception of time\n" +
                        "            synchronization command.\n" +
                        "       YYYY= Error data\n" +
                        "         X in the range from 10 to 16 shows the positioning \n" +
                        "           sub-mode.\n" +
                        "         0:Program mode  1:Search mode  2:PH mode  3:Teach mode\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Invertor unit not compatible with NC software\n" +
                        "       - Invertor unit control board\n" +
                        "       - NC software");

        ExampleItem MCS_CON_SPEED_OVER = new ExampleItem("1179", "MCS CON SPEED OVER",
                "Increments for positioning command (SRCOND) issued from\n" +
                        "       the NC to the invertor unit exceed the allowable limit.\n" +
                        "       If this alarm occurs in the axis to be positioned, the\n" +
                        "       servo data file has wrong data. (This is because the\n" +
                        "       invertor unit calculates the increments for the axis to\n" +
                        "       be positioned.)\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Absolute value of increments processed for acceleration/\n" +
                        "       deceleration [(pr/65536)/Tp]\n" +
                        "       Where, pr= One turn of position encoder; Tp= Position\n" +
                        "       control frequency\n" +
                        "       The following codes, however, have specific meanings:\n" +
                        "       1: The increments were so large that they were judged\n" +
                        "          erroneous in preliminary check.\n" +
                        "       2: The position command (SRCON) exceeds the absolute\n" +
                        "          value of the encoder measuring range (linear axis only).\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Servo data file\n" +
                        "       - NC software");

        ExampleItem MCS_SPEED_COMMAND_OVER = new ExampleItem("1180", "MCS SPEED COMMAND OVER",
                "Speed command value issued from the NC to the invertor\n" +
                        "       unit exceeds the allowable limit.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Speed command [(rev/4294967269)/Tv]\n" +
                        "       rev= One motor turn; Tv= Speed control frequency\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Servo data file\n" +
                        "       - NC software");

        ExampleItem MCS_DIFF_OVER = new ExampleItem("1181", "MCS DIFF OVER",
                "Axis movement caused a large positioning error.\n" +
                        "       While the axis is in a target position or stopped, the\n" +
                        "       target value and the calculated value are the same. \n" +
                        "       With an axis movement command, the NC starts creating\n" +
                        "       calculation values (RCON) until the target point is\n" +
                        "       reached. At this time, the actual position follows the\n" +
                        "       calculated value with a certain delay. \n" +
                        "       This delay is called \"following error\" and calculated\n" +
                        "       by ([calculation value] - [actual value]). \n" +
                        "       If the \"following error\" exceeds the allowable limit,\n" +
                        "       the above alarm occurs.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Absolute value of following error [pr/65536]\n" +
                        "       pr = One turn of position encoder\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Overload due to faulty ball screw or bearing\n" +
                        "       - Motor\n" +
                        "       - Invertor unit\n" +
                        "       - Servo data file");

        ExampleItem MCS_APA_SPEED_OVER = new ExampleItem("1182", "MCS APA SPEED OVER",
                "The position encoder value (RAPA) changes as the motor\n" +
                        "       rotates. The NC checks this change with preset frequency.\n" +
                        "       This alarm occurs if the change per unit time exceeds the\n" +
                        "       allowable range consecutively. For example, an axis feedrate \n" +
                        "       is abnormally high compared with the normal rapid feedrate, \n" +
                        "       or the encoder value changes irregularly due to malfunction\n" +
                        "       of the position encoder.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code]\n" +
                        "       Absolute value of the change in encoder value per \n" +
                        "       position control frequency \n" +
                        "       [encoder's 1/65536 turn/position control frequency]\n" +
                        "       The following codes, however, have specific meanings:\n" +
                        "       1= Linear axis has exceeded its travel range.\n" +
                        "       2= Rotary axis has exceeded its travel range (360) or\n" +
                        "          limited axis has negative positional data.\n" +
                        "       3= Limited axis has exceeded its travel range.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Motor encoder (BL motor)\n" +
                        "       - Encoder link cables or connectors (BL motor)\n" +
                        "       - PG or magnetic encoder (VAC motor)\n" +
                        "       - PG or magnetic encoder cables or connectors (VAC motor)\n" +
                        "       - Invertor unit control board");

        ExampleItem MCS_FULL_CLOSED_APA_ERROR = new ExampleItem("1183", "MCS FULL-CLOSED APA ERROR",
                "Difference between the full-closed loop encoder value\n" +
                        "       and the motor encoder value exceeds the allowable range.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Number of times the error has been detected\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Synthetic offset data is not set at the full-closed\n" +
                        "         loop encoder or wrong data is set.\n" +
                        "       - ABSO SCALE or position encoder with shaft\n" +
                        "       - Excessive lost motion in axis drive system (The motor\n" +
                        "         is not rigidly connected with the movable part.)\n" +
                        "       - Slippage or breakage of shaft belt\n" +
                        "       - Loose coupling between motor and ball screw\n" +
                        "       - Improper positional loop gain (too high)");

        ExampleItem MCS_OVER_SPEED = new ExampleItem("1184", "MCS OVER SPEED",
                "Actual motor speed is too high.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Motor speed detected when this alarm occurred\n" +
                        "              [(rev/4294967296)/Tv]\n" +
                        "       Where, rev= One motor turn; Tv= Speed control frequency\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Motor encoder (BL motor)\n" +
                        "       - Encoder link cables or connectors (VAC motor)\n" +
                        "       - Resolver or magnetic encoder (VAC motor)\n" +
                        "       - Resolver or magnetic encoder cables or connectors \n" +
                        "         (VAC motor)\n" +
                        "       - Invertor unit control board");

        ExampleItem MCS_VELOCITY_DEVIATION_OVER = new ExampleItem("1185", "MCS VELOCITY DEVIATION OVER",
                "Actual motor speed excessively deviates from the speed\n" +
                        "       command.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "       XXXX: Detected torque (sum of the torque data collected \n" +
                        "             for 3.2 ms)\n" +
                        "          +-2^-12[MAXTRQ]\n" +
                        "          If Tv = 0.4 ms, the momentary maximum torque is H'7FFF.\n" +
                        "          If Tv = 0.8 ms, the momentary maximum torque is H'3FFF.\n" +
                        "       YYYY: Detected acceleration (average value measured for \n" +
                        "             3.2 ms)\n" +
                        "          +-2^-16[vr/3.2 ms/3.2 ms]\n" +
                        "          = about 0.1 [1/min/ms]\n" +
                        "       The code number 00000001 means that the error data is\n" +
                        "       replaced by zero because of exponent underflow.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - The motor does not turn because of (mechanical lock or)\n" +
                        "         application of large load.");

        ExampleItem MCS_COLLISION_DETECTED = new ExampleItem("1186", "MCS COLLISION DETECTED",
                "The NC torque limiter has detected collision of axis by\n" +
                        "       monitoring the relation between motor output torque and\n" +
                        "       motor acceleration.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXYYYY\n" +
                        "       XXXX: Detected torque (sum of torque data collected for \n" +
                        "       \t3.2 ms)\n" +
                        "           +-2^-12[MAXTRQ]\n" +
                        "           If Tv = 0.4 ms, the momentary maximum torque is H'7FFF.\n" +
                        "           If Tv = 0.8 ms, the momentary maximum torque is H'3FFF.\n" +
                        "       YYYY: Detected acceleration (average torque measured for\n" +
                        "             3.2 ms)\n" +
                        "           +-2^-16[vr/3.2 ms/3.2 ms]\n" +
                        "           = about 0.1 [1/min/ms]\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Collision\n" +
                        "       - Motor encoder\n" +
                        "       - NC torque limiter set value");

        ExampleItem MCS_URGENT_STOP_TIME_OVER = new ExampleItem("1187", "MCS URGENT-STOP TIME OVER",
                "The axis cannot stop within a preset time after reception\n" +
                        "       emergency stop command.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXXXXX\n" +
                        "       1: Emergency stop time over\n" +
                        "       2: Deceleration time over at emergency stop\n" +
                        "       3: Deceleration time over at alarm stop\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Invertor unit control board\n" +
                        "       - NC software");

        ExampleItem MCS_BELT_IS_BROKEN = new ExampleItem("1188", "MCS BELT IS BROKEN",
                "Breakage of belt was detected in the belt-driven axis.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] Load torque (hexadecimal) at the time of alarm \n" +
                        "       detection\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Broken belt");

        ExampleItem MCS_AXIS_CHANGE_CONTROL_ERROR = new ExampleItem("1189", "MCS AXIS CHANGE CONTROL ERROR",
                "Axis change wasü@not performed normally. \n" +
                        "       (This is not an alarm caused in MCS.)\n" +
                        "       [Object]Axis to be selected by axis change\n" +
                        "       [Character-string]None\n" +
                        "       [Code]\n" +
                        "       1 MCS was not reset within 10s.\n" +
                        "       2 Parameter set numbers matching signal or control ready\n" +
                        "         signal failed to come ON within 10s.\n" +
                        "       3 MCS failed to receive the maximum APA value from the\n" +
                        "         split encoder within 10s.\n" +
                        "       6 MCS controller failed to change in-position amount or\n" +
                        "         zero offset amount within 10s.\n" +
                        "       A MCS controller failed to change in-position amount or\n" +
                        "         zero offset amount within 10s after alarm occurrence.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Faulty MCS controller for PLC axis\n" +
                        "       - Faulty software");

        ExampleItem MCS_INDEPENDENT_ENCODER_INIT = new ExampleItem("1190", "MCS INDEPENDENT ENCODER INIT",
                "An error occurred during initialization of the MCS\n" +
                        "       independent encoder.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXYYZZZZ\n" +
                        "       XX-> Encoder link sequence number\n" +
                        "        0: Reset\n" +
                        "        1: Net address setting\n" +
                        "        2: Request to send the basic information for \n" +
                        "           communication\n" +
                        "        3: Change of communication software version\n" +
                        "        4: Acquisition of device information\n" +
                        "        5: Parameter change\n" +
                        "        6: AT mode start\n" +
                        "       YY-> Alarm content\n" +
                        "        0: Communication error\n" +
                        "        1: Transmission start time over\n" +
                        "        2: Transmission end time over\n" +
                        "        3: Reception end time over\n" +
                        "        4: Wrong response address\n" +
                        "        5: Wrong response code\n" +
                        "        6: Parameter error\n" +
                        "       ZZZZ-> Data\n" +
                        "        YY = 0: Encoder link error status C2ERR established\n" +
                        "       \ton detection of the error\n" +
                        "        YY = 1, 2, or 3: Transmitted frame information QC2MTINF\n" +
                        "        YY = 4: Net address of the corresponding device\n" +
                        "        YY = 5: Received frame information QC2RXINF\n" +
                        "        YY = 6: Parameter number at which the error is detected\n" +
                        "         1 = Reception of insufficient number of parameters\n" +
                        "         2 = Basic information for communication being \n" +
                        "             incompatible\n" +
                        "         3 = Multi-turn detection range over\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Independent position encoder\n" +
                        "       - Encoder link cables and connectors\n" +
                        "       - Invertor unit control board");

        ExampleItem MCS_APA_ERROR = new ExampleItem("1191", "MCS APA ERROR",
                "An error occurred during calculation of APA value.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXXXXXXX\n" +
                        "       1: Linear axis divided travel over\n" +
                        "       2: Overflow during conversion of semi-position from\n" +
                        "          [pr] to [pf].\n" +
                        "       3: Underflow in synthesizing the axis data\n" +
                        "       4: Overflow in synthesizing the axis data\n" +
                        "       5: Overflow of input values used for hybrid control\n" +
                        "       6: Overflow during initialization for hybrid control\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Motor encoder, encoder with shaft, or ABSO SCALE\n" +
                        "       - Invertor unit control board\n" +
                        "       - Servo data file\n" +
                        "       If the alarm code is \"1\" or \"3\", the position encoder\n" +
                        "       may not be properly offset to zero.\n" +
                        "       If the alarm code is \"4\", the servo data file may be \n" +
                        "       defective.\n" +
                        "       If the alarm code is \"5\" or \"6\", the motor coupling, \n" +
                        "       encoder with shaft, or ABSO SCALE may be loosely mounted.");

        ExampleItem MCS_MOTOR_OVER_LOAD = new ExampleItem("1192", "MCS MOTOR OVER LOAD",
                "The motor load has exceeded the preset value,\n" +
                        "       activating the overload protection function.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] YYYYZZZZ\n" +
                        "       YYYY-> Gamma of the protection curve used to detect overload\n" +
                        "       ZZZZ-> Internally calculated overload data\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Motor\n" +
                        "       - Overload caused by machine operation\n" +
                        "       - Servo data file");

        ExampleItem MCS_ABSO_SCALE_SUB_SLIDER_ERROR = new ExampleItem("1194", "MCS ABSO SCALE SUB SLIDER ERROR",
                "ERROR occurred by sub-slider of absoscale for the\n" +
                        "       transfer spec.\n" +
                        "       [Index]Axis or None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]XXYYZZZZ\n" +
                        "       XX E-link sequence number in detecting error\n" +
                        "        0:Reset\n" +
                        "        1:Net address setting\n" +
                        "        2:Communucation basis information demand\n" +
                        "        3:Change of communucation version.\n" +
                        "        4:Device information acquisition.\n" +
                        "        5:Change of parameter.\n" +
                        "        6:AT mode start\n" +
                        "       YY Error contents\n" +
                        "        0:Communication error\n" +
                        "        1:Transmission start timeover\n" +
                        "        2:Transmission complete timeover\n" +
                        "        3:Reception complete timeover\n" +
                        "        4:Response address error\n" +
                        "        5:Response code error\n" +
                        "        6:Paremeter error\n" +
                        "       ZZZZ Data\n" +
                        "        YY=0:E-link error status in detecting error C2ERR\n" +
                        "        YY=1,2,3:\n" +
                        "             Transmitting frame information QC2MTINF\n" +
                        "        YY=4:Net address of response-device\n" +
                        "        YY=5:Receiving frame information QC2RXINF\n" +
                        "        YY=6:The number of showing parameter which detected error\n" +
                        "         1=Shortage of the number of receiving parameter\n" +
                        "         2=Incongruousness of Communucation basis information\n" +
                        "         3=Incongruousness of many rotation detection range");

        ExampleItem MCS_TANDEM_COMMUNICATION_ERROR = new ExampleItem("1195", "MCS TANDEM COMMUNICATION ERROR",
                "Concerning tandem control of synchronism-axis,\n" +
                        "       The communication data that slave-axis received in\n" +
                        "       communication between slave-station was ERROR.\n" +
                        "       [Object]Axis(Main-spindle) or None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]XXXXYYYY\n" +
                        "       XXXX:\n" +
                        "        XXXX=1 The communication data is not counted.\n" +
                        "              YYYY is always \"0\".\n" +
                        "        XXXX=2 Format cord of the communication data can not\n" +
                        "       \tcorrespond.\n" +
                        "              YYYY is Low-order 1byte of this cord.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       MCS unit,MCS soft");

        ExampleItem MCS_FULL_ABSO_SCALE_LINK_ERROR = new ExampleItem("1196", "MCS FULL ABSO SCALE LINK ERROR",
                "An alarm occurred in full absolute scale communication.\n" +
                        "       [Object] AXIS or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXYYZZZZ\n" +
                        "       XX=FF Fixed\n" +
                        "       YY=00 Fixed\n" +
                        "       ZZZZ= E-link error status at the time of error detection.\n" +
                        "             Each bit shows the kind communication error.\n" +
                        "         bit15  1: Communication error generated by independent \n" +
                        "       \t    encoder\n" +
                        "         bit14  1: Communication error generated by ABSOSCALE 2\n" +
                        "         bit13  1: Communication error generated by ABSOSCALE or\n" +
                        "       \t    axis-mount encoder.\n" +
                        "         bit12  1: Communication error generated by monitor \n" +
                        "       \t    encoder\n" +
                        "         bit11   : Not defined\n" +
                        "         bit10  1: AT mode transmission loop error\n" +
                        "         bit9\t 1: Excessive number of data counts at the\n" +
                        "       \t    receiving interface\n" +
                        "         bit8\t Not defined\n" +
                        "         bit7\t Not defined\n" +
                        "         bit6\t 1: Modulation code error\n" +
                        "         bit5\t 1: CRC error\n" +
                        "         bit4\t 1: Format error\n" +
                        "         bit3\t 1: Double transmission error\n" +
                        "         bit2\t 1: Double reception error\n" +
                        "         bit1\t 1: Parity error\n" +
                        "         bit0\t 1: Time-out error\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Full ABSOSCALE\n" +
                        "       - Encoder link cable or connector\n" +
                        "       - Inverter unit control board");

        ExampleItem MCS_FULL_ABSO_SCALE_ERROR = new ExampleItem("1197", "MCS FULL ABSO SCALE ERROR",
                "The full absolute scale has become unable to detect\n" +
                        "       positional data.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXYYZZZZ\n" +
                        "       XX= Encoder error code depending on the encoder type\n" +
                        "       YY= Detailed encoder status. The status varies with the\n" +
                        "           encoder type.\n" +
                        "       ZZZZ= Multi-turn position data. This data appears when\n" +
                        "           the multi-turn position data has exceeded the rotating\n" +
                        "           range.\n" +
                        "       XX = 0 (fixed)\n" +
                        "       YY = 1 (fixed)\n" +
                        "       ZZZZ = Multi-turn position data\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Full absolute scale");

        ExampleItem MCS_FULL_ABSO_SCALE_INITIAL = new ExampleItem("1198", "MCS FULL ABSO SCALE INITIAL",
                "An error occurred in initialization of the full absolute scale.\n" +
                        "       [Object] Axis name or none (spindle)\n" +
                        "       [Character-string] None\n" +
                        "       [Code] XXYYZZZZ\n" +
                        "        XX= Encoder link sequence number at the time of error\n" +
                        "           detection\n" +
                        "         0: Reset\n" +
                        "         1: Network address setting\n" +
                        "         2: Request of basic information on communication\n" +
                        "         3: Change of communication version\n" +
                        "         4: Acquisition of device information\n" +
                        "         5: Parameter change\n" +
                        "         6: AT (auto) mode start\n" +
                        "        YY= Error content\n" +
                        "         0: Communication error\n" +
                        "         1: Transmission start time over\n" +
                        "         2: Transmission finish time over\n" +
                        "         3: Reception finish time over\n" +
                        "         4: Abnormal response address\n" +
                        "         5: Abnormal response code\n" +
                        "         6: Parameter error\n" +
                        "        ZZZZ= Additional data\n" +
                        "         If YY=0, the encoder link error status C2ERR at the time\n" +
                        "       \tof error detection appears.\n" +
                        "         If YY=1, 2, or 3, the transferred frame information\n" +
                        "       \tQC2MTINF appears.\n" +
                        "         If YY=4, the network address of the responding device\n" +
                        "       \tappears.\n" +
                        "         If YY=5, the received frame information QC2RXINF appears.\n" +
                        "         If YY=6, the number of parameter that caused the alarm\n" +
                        "       \tappears.\n" +
                        "          1= Not all the necessary parameters are received.\n" +
                        "          2= Basic information on communication is incompatible.\n" +
                        "          3= Multi-rotation detection range does not match.\n" +
                        "       But,in the case that voltage of encoder-fuse is failed,\n" +
                        "         XXXX: $FFFF (fix)\n" +
                        "         ZZZZ: voltage of encoder-fuse\n" +
                        "             (12[V] = $9980)\tNormal: from 10.6 to 13.8 [V]\n" +
                        "       \t\t\tPermmssive: from $8800 to $B000\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       - Full absolute scale\n" +
                        "       - Encoder link cables or connectors\n" +
                        "       - Invertor unit control board");

        ExampleItem MCS_AXIS_STOP_SIGNAL_ERROR = new ExampleItem("1199", "MCS AXIS STOP SIGNAL ERROR",
                "OSP detected that a PSRDY signal input into an MIV unit\n" +
                        "       malfunctioned.\n" +
                        "       [Object]Axis name or none(spindle)\n" +
                        "       [Character string]None\n" +
                        "       [Code]1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Defectiveness of a stroke end limit switch or the\n" +
                        "       damage of the signal line.\n" +
                        "       Damage of an OPR line connected to in a power supply \n" +
                        "       unit or poor contact of a connector.\n" +
                        "       Damage of a converter link cable of an MIV unit or\n" +
                        "       poor contact of a connector.\n" +
                        "       FUB-DR3 or malfunction of a POS unit.");

        ExampleItem STROKE_END_OVER = new ExampleItem("1200", "STROKE END OVER",
                "An axis has hit the stroke end limit.\n" +
                        "       [Code]\n" +
                        "       None->The turret has hit the stroke end limit by X- or\n" +
                        "       Z-axis command.\n" +
                        "       1->During Y-axis movement on the machine with Y-axis\n" +
                        "          function, the X-axis hit the stroke end limit.\n" +
                        "       2->An axis hit the stroke end limit by M273 HP command\n" +
                        "          (home position command within the stroke end limits).\n" +
                        "       4->Present location (APA) exceeded the stroke end limit.\n" +
                        "          Or, the stroke end limit was set internally in present\n" +
                        "          location.\n" +
                        "         (When the stroke end limit is set for the first time,\n" +
                        "          it is generated without fail.)\n" +
                        "       5->C-axis stroke over range in C-axis multi rev mode.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1->Operation error, programming error\n" +
                        "       2->Setting error of soft-limit positions(positive/negative).\n" +
                        "          (The soft-limit position is set outside the stroke end\n" +
                        "           limit position.)\n" +
                        "       3->Check the stroke end limit switches.\n" +
                        "          (Is it turned on by chips or other foreign matter?)\n" +
                        "       [Measures to Take]\n" +
                        "       Push the reset button in the manual mode while turning\n" +
                        "       on the emergency limit release switch on the control box,\n" +
                        "       then move the turret away from the emergency limit\n" +
                        "       position by rotating the pulse handle.\n" +
                        "       After the emergency limit switch has been released, turn\n" +
                        "       off the emergency limit release switch in the original\n" +
                        "       position and re-set the soft-limit position.\n" +
                        "       In the case of new LT control specification, it is moved\n" +
                        "       an axis in the direction which goes away from stroke end\n" +
                        "       limit.");

        ExampleItem PLUS_VARIABLE_LIMIT_OVER = new ExampleItem("1202", "PLUS VARIABLE LIMIT OVER",
                "An axis movement command to move the axis beyond the\n" +
                        "       variable limit position in the positive direction is\n" +
                        "       designated.\n" +
                        "       [Object]AXIS\n" +
                        "       [Code]\n" +
                        "       1->In G00, G01, G32, G33, G34 or G35 mode\n" +
                        "       2->In G02 or G03 mode; when restarting from manual\n" +
                        "          interruption\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Axis command error (a value exceeding the variable\n" +
                        "         limit in the positive direction has been specified)\n" +
                        "       2)Setting error of the variable limit in the positive\n" +
                        "         direction (set by user parameter)\n" +
                        "       [Measures to Take]\n" +
                        "       1)Correct the axis command value so that the target point\n" +
                        "         does not exceed the variable limit in the positive \n" +
                        "         direction.\n" +
                        "       2)Change the variable limit in the positive direction so\n" +
                        "         that the target point of the specified axis command\n" +
                        "         falls within a movable travel range.\n" +
                        "       3)Check the tool offset value.\n" +
                        "       4)Check the zero offset value.");

        ExampleItem MINUS_VARIABLE_LIMIT_OVER = new ExampleItem("1203", "MINUS VARIABLE LIMIT OVER",
                "An axis movement command to move the axis beyond the\n" +
                        "       variable limit position in the negative direction is\n" +
                        "       designated.\n" +
                        "       [Object]AXIS, SYSTEM\n" +
                        "       [Code]\n" +
                        "       1->In G00, G01, G32, G33, G34 or G35 mode\n" +
                        "       2->In G02 or G03 mode; when restarting from manual\n" +
                        "          interruption\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Axis command error (a value exceeding the variable\n" +
                        "         limit in the negative direction has been specified)\n" +
                        "       2)Setting error of the variable limit in the negative\n" +
                        "         direction (set by user parameter)\n" +
                        "       [Measures to Take]\n" +
                        "       1)Correct the axis command value so that the target point\n" +
                        "         does not exceed the variable limit in the negative \n" +
                        "         direction.\n" +
                        "       2)Change the variable limit in the negative direction so\n" +
                        "         that the target point of the specified axis command\n" +
                        "         falls within a movable travel range.\n" +
                        "       3)Check the tool offset value.\n" +
                        "       4)Check the zero offset value.");

        ExampleItem USER_RESERVE_CODE = new ExampleItem("1213", "USER RESERVE CODE",
                "The alarm designated by output variable 993.\n" +
                        "       This alarm occurs when the following program is executed.\n" +
                        "       VDOUT [993] = oooo\n" +
                        "       \t      ^^^^code\n" +
                        "       [Character-string]\n" +
                        "       Character-string as specified by system variable VUACM\n" +
                        "       [Code][Code]as specified at VDOUT [993]\n" +
                        "       [Probable Faulty Locations]Conditions set by the user\n" +
                        "       Program ExampleVDOUT [993] = 3000\n" +
                        "       [Measures to Take]Cancel the conditions set by the user.\n" +
                        "       Related Specification:User task 2");

        ExampleItem SM_COMMAND_ASYNCHRONOUS = new ExampleItem("1215", "S.M COMMAND ASYNCHRONOUS",
                "Under simultaneous four-axis control mode, S or M command\n" +
                        "       provided with constant cutting speed code does not match\n" +
                        "       between turret A and B for 2-saddle specification.\n" +
                        "       [Object]SYSTEM\n" +
                        "       Character-string:Coordinate system for G140, G141, or G142\n" +
                        "       [Code]\n" +
                        "       1->Mismatch of constant cutting speed codes (G96 and G97)\n" +
                        "       2->Mismatch of turret selection commands (G110 and G111)\n" +
                        "       3->Mismatch of S commands\n" +
                        "       4->Mismatch of spindle rotation commands (M03, M04 and M05)\n" +
                        "       5->Mismatch of spindle drive gear range commands\n" +
                        "          (M40 through M44)\n" +
                        "       6->Mismatch of M00 and M01\n" +
                        "       7->Mismatch of M19 command\n" +
                        "       8->Mismatch of M110 and M109\n" +
                        "       9->M271, M272 instructions are different.\n" +
                        "       10->M371, M372 instructions are different.\n" +
                        "       11->M142, M143 instructions are different.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Mismatching S and/or M code command in simultaneous \n" +
                        "       four-axis cut program.\n" +
                        "       Program Example:\n" +
                        "        Turret A\n" +
                        "         N100 G00 X500 Z500\n" +
                        "         N101 M41 M03 S100 P10\n" +
                        "        Turret B\n" +
                        "         N200G00X500Z500\n" +
                        "         N201M42M03S500P10\n" +
                        "       \t    ^^^^\n" +
                        "       [Measures to Take]Correct the program.\n" +
                        "       Example\n" +
                        "       In the program above, change the commands in N201 sequence\n" +
                        "       as indicated below:\n" +
                        "         N201M41M03S100P10\n" +
                        "       \t    ^^^^\n" +
                        "       Always designate the same S and M code commands at both\n" +
                        "       turrets.\n" +
                        "       [Related Specifications]2S specification");

        ExampleItem SYNCHRONOUS_P_CODE = new ExampleItem("1216", "SYNCHRONOUS P CODE",
                "P code commands are not designated in the ascending order\n" +
                        "       for 2-saddle specification (except when the P commands are\n" +
                        "       negative values).\n" +
                        "       Or P commands for both A- and B-turrets have negative and\n" +
                        "       mismatching values.\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Code]\n" +
                        "       1->There is a P command assigned with a numerical value\n" +
                        "          smaller than the one assigned to the presently executed \n" +
                        "          P command.\n" +
                        "       2->Mismatch between negative values of P commands for \n" +
                        "          A- and B-turrets.\n" +
                        "       [Probable Faulty Locations]Program error\n" +
                        "         G00X500Z500P30\n" +
                        "         M41M03S500P20\n" +
                        "       [Measures to Take]Correct the program.\n" +
                        "       In the example, change P20 into P40 so that P code values\n" +
                        "       increase orderly.");

        ExampleItem TORQUE_LIMITER = new ExampleItem("1217", "TORQUE LIMITER",
                "With the torque limiter cancel switch OFF in a mode other\n" +
                        "       than MANUAL, the input from the mechanical torque limiter\n" +
                        "       is turned OFF.\n" +
                        "       [Code]\n" +
                        "       1->ZA-axis\n" +
                        "       2->XA-axis\n" +
                        "       3->ZB-axis\n" +
                        "       4->XB-axis");

        ExampleItem TORQUE_LIMITER_CANCEL = new ExampleItem("1218", "TORQUE LIMITER CANCEL",
                "With the torque limiter cancel switch ON, automatic mode\n" +
                        "       is selected.In automatic mode, the torque limiter cancel\n" +
                        "       switch is turned ON.\n" +
                        "        ");

        ExampleItem TORQUE_LIMITER_OVER = new ExampleItem("1219", "TORQUE LIMITER OVER",
                "In torque skip cycle, the set torque value is exceeded\n" +
                        "       before the axis reaches the deceleration point D.\n" +
                        "       [Code]X\n" +
                        "       1->In torque skip cycle, the set torque value is exceeded\n" +
                        "          before the axis reaches the deceleration point D.\n" +
                        "          Or, the set torque value is exceeded before the axis reaches\n" +
                        "          the \"goal-point - D\" in torque limit check.\n" +
                        "       2->In torque limit check(G23), the set torque value is\n" +
                        "          exceeded before the axis reaches the \"goal-point + L\".\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Data setting error at the parameter (word) No. 70 \"Torque\n" +
                        "       monitor delay time\". Data setting error with G22, G23 command.");

        ExampleItem TORQUE_SKIP_CONDITION_NO_SATISFY = new ExampleItem("1220", "TORQUE SKIP CONDITION NO SATISFY",
                "Torque skip is not generated when it is attempted, and the\n" +
                        "       axis reaches the designated point. (In workpiece transfer,\n" +
                        "       the workpiece failed to reach the opposite chuck.)\n" +
                        "       [Code]2->The axis reaches the designated point (Z-L).");

        ExampleItem DUPLICATE_M_CODE = new ExampleItem("1221", "DUPLICATE M-CODE",
                "Before the execution of an M code, another M code which\n" +
                        "       belongs to the same M-code group is designated (M07/M08, \n" +
                        "       and so forth).\n" +
                        "       (In the case of process-combined machining such as thread\n" +
                        "       cutting, this error occurs when the program is read and\n" +
                        "       stored in the buffer.)\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Character-string]Designated M-code group\n" +
                        "       (\"M08\" is displayed in the case of M08/M09.)");

        ExampleItem INTERRUPT_RETURN_POINTER_UNMATCH = new ExampleItem("1222", "INTERRUPT RETURN POINTER UNMATCH",
                "After manual operation intervention to retract the cutting\n" +
                        "       tool, the tool is returned to a different block from the\n" +
                        "       block where the interruption was made. This alarm occurs\n" +
                        "       when the number of execution blocks differs between the\n" +
                        "       cycle starting after the reset and the sequence restart\n" +
                        "       operation.\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The program contains a conditional statement which changes\n" +
                        "       the number  of sequences to be executed. The conditional \n" +
                        "       statement is judged by whether the conditional expression \n" +
                        "       is true or the local variable is defined.\n" +
                        "       Program Example:\n" +
                        "        N0018 IF ABCD N0020\n" +
                        "        N0019 ABCD=1 <- This defines the local variable.\n" +
                        "        N0020\n" +
                        "       In the first execution of the program, sequence N0019 is\n" +
                        "       executed because there is no local variable ABCD. \n" +
                        "       In the sequence restart operation, however, sequence N0019\n" +
                        "       is not executed.\n" +
                        "       Related SpecificationTool retraction cycle");

        ExampleItem THREAD_FEED = new ExampleItem("1223", "THREAD FEED",
                "In cutting a variable lead thread, the lead is zero or a\n" +
                        "       negative value.\n" +
                        "       Calculation error has occurred in the calculation of feed\n" +
                        "       for variable lead thread cutting.\n" +
                        "       [Object]AXIS, SYSTEM\n" +
                        "       [Code]XX->Floating point calculation error\n" +
                        "        Will convert to binary number.\n" +
                        "             --X--   --X--\n" +
                        "        bit 7 6 5 4 3 2 1 0\t\t\t       HEX\n" +
                        "        bit0->Overflow in converting into integer------01\n" +
                        "        bit1->Exponential underflow--------------------02\n" +
                        "        bit2->Exponential overflow---------------------04\n" +
                        "        bit3->Calculation of root of a negative number-08\n" +
                        "        bit4->Division by 0----------------------------10\n" +
                        "        bit5->Angle overflow---------------------------20\n" +
                        "       The codes indicated above are generated when calculation\n" +
                        "       becomes impossible during thread lead calculation processing.\n" +
                        "       [Probable Faulty Locations]Wrong F and E commands in the\n" +
                        "       variable lead thread cutting command\n" +
                        "       Program Example:\n" +
                        "        G00  X100  Z100\n" +
                        "        G33  X50   Z50  E-5  F10\n" +
                        "       Feed becomes a negative value with the program indicated\n" +
                        "       above.");

        ExampleItem CONTOUR_GENERATION_CALCULATION = new ExampleItem("1225", "CONTOUR GENERATION CALCULATION",
                "Calculation error has occurred during the tool path\n" +
                        "       generation of contour generation function of G101, G102\n" +
                        "       or G103.\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Code]XYY\n" +
                        "       YY:\n" +
                        "        Bit0->Overflow in converting into integer\n" +
                        "        Bit1->Exponential underflow\n" +
                        "        Bit2->Exponential overflow\n" +
                        "        Bit3->Calculation of root of a negative number\n" +
                        "        Bit4->Division by 0\n" +
                        "        Bit5->Angle overflow for SIN, COS, TAN and COT\n" +
                        "       X:\n" +
                        "        1->Former half of G101 tool path generation operation\n" +
                        "        2->Latter half of G101 tool path generation operation\n" +
                        "        3->Former half of G102 (G103) tool path generation \n" +
                        "           operation\n" +
                        "        4->Latter half of G102 (G103) tool path generation \n" +
                        "           operation\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       This alarm is set taking the following possibility into\n" +
                        "       consideration, and does not occur in normal conditions.\n" +
                        "       During calculation processing in the NC, calculation might\n" +
                        "       become impossible due to the influence of calculation error.\n" +
                        "       [Measures to Take]\n" +
                        "       Change the command value in the program within an allowable\n" +
                        "       range.");

        ExampleItem SPINDLE_MODE_ILLEGAL = new ExampleItem("1228", "SPINDLE MODE ILLEGAL",
                "A W-axis move command is designated while the same spindle\n" +
                        "       is not selected for both turrets.\n" +
                        "       [Code]\n" +
                        "       1->A W-axis move command is designated.\n" +
                        "       2->The W-axis synchronized feed command is designated.\n" +
                        "       [Probable Faulty Locations]Program error\n" +
                        "       [Related Specifications]Specified model (LT)");

        ExampleItem SPINDLE_MAX_REVOLUTION_DESIGNATION = new ExampleItem("1229", "SPINDLE MAX REVOLUTION DESIGNATION",
                "The allowable maximum spindle speed (G50 S****) is not\n" +
                        "       designated before the spindle rotation command is \n" +
                        "       designated for the automatic operation.\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Code]1\n" +
                        "       [Probable Faulty Locations]Program error");

        ExampleItem SPINDLE_INTERFERENCE_DISTANCE = new ExampleItem("1238", "SPINDLE INTERFERENCE DISTANCE",
                "1)ZA axis or ZB axis moved to the position where distance\n" +
                        "         between ZA axis and ZB axes become smaller than setting\n" +
                        "         value of parameter 1 concerning new LT control.\n" +
                        "       2)ZB axis moved to the position which becomes smaller than\n" +
                        "         setting value of parameter 2 by the condition\n" +
                        "         whose XA axis and XB axis are not together concerning\n" +
                        "         new LT control on Plus variable limit.\n" +
                        "       3)By the Spindlehead interlock specification, Z axis moved\n" +
                        "         to the position which becomes smaller than setting value\n" +
                        "         of parameter 3 by the condition whose X axis is not on\n" +
                        "         Plus variable limit.\n" +
                        "       [Code]\n" +
                        "       1->A case of mention above 1)\n" +
                        "       2->A case of mention above 2)\n" +
                        "       3->A case of mention above 3)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Incorrect parameter setting.\n" +
                        "       2)Operation or program error.");

        ExampleItem TURRET_ROTATION = new ExampleItem("1243", "TURRET ROTATION",
                "Turret indexing was attempted when the turret indexing\n" +
                        "       conditions are not met.\n" +
                        "       [Code]XX\n" +
                        "       1->A turret index command was issued when the facing or\n" +
                        "          OD tool clamp confirmation signal was OFF.\n" +
                        "       2->A T-command was issued when the touch setter is in\n" +
                        "          advance position.\n" +
                        "       3->On the FTL machine, the Z-axis is located in a\n" +
                        "          negative position beyond the interference position.\n" +
                        "       4->On the machine with Y-axis function, a turret index\n" +
                        "          command was issued while the YS-axis is lower than\n" +
                        "          the spindle center.\n" +
                        "       5->On the machine with NC turret, the simple tow-along\n" +
                        "          tailstock is in connection.\n" +
                        "       8->A turret index command was issued while the YS-axis\n" +
                        "          was located, in the machine coordinate system, lower\n" +
                        "          than Spindle CENTER POSITION specified by the system\n" +
                        "          parameter.\n" +
                        "       12->On the machine equipped with C-axis zero offset\n" +
                        "           function by laser sensor, a turret index command was\n" +
                        "           issued when the laser sensor retract confirmation input\n" +
                        "           was OFF.\n" +
                        "       13->The turret index instruction which is divided\n" +
                        "           impossibility was performed by the state which attached\n" +
                        "           long tool (tool variety setting at ML with do tool) \n" +
                        "           to turret T1 or the state which attached touch sensor\n" +
                        "           of a measure within a machine specification.\n" +
                        "       14->When a long tool (tool type: ML) was mounted in the\n" +
                        "           turret T1, a turret index command was issued with the\n" +
                        "           shutter closed.\n" +
                        "       15->The turret rotation interlock against special long\n" +
                        "           tool was activated because turret rotation was attempted\n" +
                        "           with a special long tool mounted on the turret.\n" +
                        "       16->Turret rotation was attempted during spindle rotation.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1->A turret index command was issued while a tool was\n" +
                        "        projected for tool change or manual tool loading/unloading.\n" +
                        "        Malfunction occurred in the proximity switch for checking\n" +
                        "        clamping condition of facing/OD tool.\n" +
                        "        The signal wire from the proximity switch is damaged.\n" +
                        "        The hydraulic solenoid valve for clamping face/OD tool\n" +
                        "        is broken.\n" +
                        "       8->A turret indexing command was issued while the Y-axis\n" +
                        "        is in a negative position in Y-axis mode.\n" +
                        "       12->A turret index command was issued with the laser sensor\n" +
                        "        located in advance position, or the laser sensor retract\n" +
                        "        confirmation LS is at fault.\n" +
                        "       [Related Specifications]\n" +
                        "       1) ATC , multiple machine , Y axis");

        ExampleItem TOOL_INTERFERENCE_CHECK = new ExampleItem("1245", "TOOL INTERFERENCE CHECK",
                "The turrets approach each other within the tool\n" +
                        "       interference check area.\n" +
                        "       The machine equipped with ATC specification, turret\n" +
                        "       indexingcommand is designated in the direction a tool on\n" +
                        "       the ATC turret will interfere with the duct.\n" +
                        "       [Object]SYSTEM for the machine equipped with ATC\n" +
                        "             None for other machines\n" +
                        "       [Code]\n" +
                        "       1->Interference between tools on A- and B-turret\n" +
                        "       2->Interference between the B-turret and a tool on \n" +
                        "          A-turret\n" +
                        "       3->Interference between the A-turret and a tool on \n" +
                        "          B-turret\n" +
                        "       4->Interference between the A- and B-turret\n" +
                        "       11->Interference between L-tool (T1) and duct in clockwise\n" +
                        "          rotation. Or interference between M-tool (T3) and\n" +
                        "          duct in counterclockwise rotation.\n" +
                        "       13->Interference between L-tool (T1) and duct in\n" +
                        "          counterclockwise rotation. Or interference between\n" +
                        "          M-tool (T3) and duct in clockwise rotation.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Programming error for simultaneous cuts on the 2saddle\n" +
                        "         models\n" +
                        "       2)Error in setting tool interference check area\n" +
                        "       [Measures to Take]\n" +
                        "       1)Check the simultaneous cuts program.\n" +
                        "       2)Check the tool interference check data.");

        ExampleItem CHUCK_BARRIER_AREA = new ExampleItem("1257", "CHUCK BARRIER AREA",
                "Entry into chuck barrier area\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Code]interference check area\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)The program includes a command which causes an axis to\n" +
                        "         enter chuck barrier area.\n" +
                        "       2)Setting error of chuck barrier area");

        ExampleItem TAILSTOCK_BARRIER_AREA = new ExampleItem("1258", "TAILSTOCK BARRIER_AREA",
                "Entry into tailstock barrier area\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Code]interference check area\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)The executed program includes a command which causes an\n" +
                        "         axis to enter tailstock barrier area.\n" +
                        "       2)Setting error of tailstock barrier area");

        ExampleItem TOW_ALONG_TAILSTOCK_CONNECT = new ExampleItem("1259", "TOW-ALONG TAILSTOCK CONNECT",
                "G02, G03, G30, G31, G32, G33, G34, or G35 is designated\n" +
                        "       while the tow-along tailstock body is connected. Or with\n" +
                        "       the simple tow-along tailstock specification, an axis move\n" +
                        "       command or turret indexing command is designated while\n" +
                        "       the tailstock body is connected.\n" +
                        "       [Code]\n" +
                        "       None->An illegal G code is designated while the tow-along\n" +
                        "             tailstock body is connected.\n" +
                        "       2->With the simple tow-along specification, axis movement\n" +
                        "          or turret indexing is attempted while the tailstock\n" +
                        "          body is connected.\n" +
                        "       3->In the automatic or MDI mode of operation,an axis\n" +
                        "          move command is designated while the tailstock body \n" +
                        "          is connected.\n" +
                        "       4->The tow-along tailstock connection command was issued\n" +
                        "          in the Y-axis control mode.\n" +
                        "       5->In tow-along tailstook concatenaion, home position\n" +
                        "          translocation instruction (OGL) was performed.\n" +
                        "       6->In self-travelling type tail-stock unclamp, G02,G03,\n" +
                        "          G30,G31,G32,G33,G34,G35 commnd was designated.\n" +
                        "       7->In self-travelling type tail-stock unclamp,\n" +
                        "          axis-movement expect for W-axis was designated.\n" +
                        "       8->W-axis order was performed by the state that there was\n" +
                        "          not tail-stock in backplace edge, or there was not\n" +
                        "          X-axis in plus limit, or self-travelling type tail-stock\n" +
                        "          was unclamp, or main-spindle was not hung-up.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)The tailstock body connected state is established\n" +
                        "         although it is actually not connected due to faulty EC \n" +
                        "         input signals.\n" +
                        "       2)Operation error\n" +
                        "       Program Example:\n" +
                        "         :\n" +
                        "         M189\n" +
                        "         G02  X100  Z50  I1  F10\n" +
                        "         :\n" +
                        "       [Measures to Take]\n" +
                        "       1)Correct the program.\n" +
                        "       2)Check the EC input signals\n" +
                        "         I/O check No.27 bit6 -> tailstock connection \n" +
                        "         confirmation\n" +
                        "         I/O check No.27 bit7 -> tailstock disconnection \n" +
                        "         confirmation\n" +
                        "       <For the simple tow-along tailstock specification>\n" +
                        "         I/O check No.27 bit7 -> tailstock disconnection \n" +
                        "         confirmation\n" +
                        "         (ON when disconnected, OFF when connected)\n" +
                        "       3)If the code 3 appears, use the pulse handle for axis\n" +
                        "         feed while the tow-along tailstock is connected.\n" +
                        "       4)After canceling the Y-axis control mode, issue the\n" +
                        "         tow-along tailstock connection command.\n" +
                        "       5)After tow-along tailstook concatenaion is separated,\n" +
                        "         a home position instruction is performed.\n" +
                        "       [Related Specifications]Programmable tailstock");

        ExampleItem TOW_ALONG_TAILSTOCK_CONDITION = new ExampleItem("1260", "TOW ALONG TAILSTOCK CONDITION",
                "M188 (Tailstock disconnect), or M189 (Tailstock connect) is\n" +
                        "       designated with G152 calling for tailstock towing mode while\n" +
                        "       the spindle is not in zero speed or while the spindle is not\n" +
                        "       at a still.\n" +
                        "       M188, M189 or G152 is designated while the spindle rotation\n" +
                        "       command is active.\n" +
                        "       M188, M189 or G152 is designated while the center work is not\n" +
                        "       selected.\n" +
                        "       M188, M189 or G152 is designated while the tailstock spindle\n" +
                        "       is not at the retraction end, or the turrets are not at the\n" +
                        "       stroke end in the positive direction.\n" +
                        "       [Code]\n" +
                        "        1->M188, M189 or G153 is designated while the spindle is not\n" +
                        "           in zero speed.\n" +
                        "        2->M188, M189 or G153 is designated while the spindle is not\n" +
                        "           at a still.\n" +
                        "        3->M188, M189 or G152 is designated while the spindle rotation\n" +
                        "           command is active.\n" +
                        "        4->M188, M189 or G152 is designated while center work is not\n" +
                        "           selected.\n" +
                        "        5->M188, M189 or G152 is designated while the tailstock spindle\n" +
                        "           is not at the retraction end.\n" +
                        "        6->M188, M189 or G152 is designated while the turrets are not\n" +
                        "           at the stroke end in the positive direction.\n" +
                        "        7->M189, M152 are designated while both of the disconnect and\n" +
                        "           connect signals are ON or OFF.\n" +
                        "        8->When the tailstock connect ON key is pressed, the spindle\n" +
                        "           is not at a still.\n" +
                        "        9->When the tailstock connect ON key is pressed, XA-axis is \n" +
                        "           not at the travel end in the positive direction.\n" +
                        "       10->When the tailstock connect ON key is pressed, the tailstock\n" +
                        "           is not at the retract end.\n" +
                        "       11->When the tailstock connect ON key is pressed, the tailstock\n" +
                        "           is not unclamped.\n" +
                        "       12->M189 is designated when the tailstock chuck is not unclamped.\n" +
                        "       13->While the tow-along tailstock or simple tow-along tailstock\n" +
                        "           was being connected, the tailstock chuck was clamped.\n" +
                        "           Or, while the tailstock chuck was being clamped, the signal\n" +
                        "           for confirming disconnection of simple tow-along tailstock\n" +
                        "           went OFF.\n" +
                        "       14->When the signal for confirming disconnection of tailstock\n" +
                        "           was OFF, a tailstock chuck clamp command was issued.\n" +
                        "       15->When it was not a tailstock concatenation carriage return\n" +
                        "           place , they went along M189 instructions.\n" +
                        "       16->Concerning NC tailstook in tailstook unclamp at G02, G03,\n" +
                        "           G30, G31, G32, G33, G34, G35 command is designated.\n" +
                        "       17->Concerning NC tailstook, an axis movement instruction\n" +
                        "           except for W, Z axis was performed in tailstook unclamp.\n" +
                        "       18->Concerning NC tailstook, W axis movement instruction was\n" +
                        "           performed by following state.\n" +
                        "              It is not XA axis plus limit.\n" +
                        "              It is not tailstock spindle retracted position\n" +
                        "              It is not tailstook unclamp\n" +
                        "              Main spindle has not stopped\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        Operation error\n" +
                        "       [Related Specifications]\n" +
                        "        Programmable tailstock");

        ExampleItem W_AXIS_PLUS_VARIABLE_LIMIT_OVER = new ExampleItem("1262", "W-AXIS PLUS VARIABLE LIMIT OVER",
                "Tow-along tailstock exceeds the W-axis plus variable \n" +
                        "       limit.\n" +
                        "       [Object]AXIS, SYSTEM\n" +
                        "       [Code]\n" +
                        "       1->During operation using programmed commands\n" +
                        "       2->During automatic returning to the joint point in\n" +
                        "          manual operation intervention mode\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       W-axis limit has been set so that the tow-along tailstock\n" +
                        "       joint position will be outside the soft-limit position.\n" +
                        "       [Measures to Take]\n" +
                        "       Shift the W-axis limit position outside if possible. \n" +
                        "       If such setting is not allowed, operate the turret\n" +
                        "       manually  and carefully to connect the tailstock so that\n" +
                        "       interference will not occur.\n" +
                        "       [Related Specifications]Programmable tailstock");

        ExampleItem W_AXIS_MINUS_VARIABLE_LIMIT_OVER = new ExampleItem("1263", "W-AXIS MINUS VARIABLE LIMIT OVER",
                "Tow-along tailstock exceeds the W-axis minus variable \n" +
                        "       limit.\n" +
                        "       [Object]AXIS, SYSTEM\n" +
                        "       [Code]\n" +
                        "       1->During operation using programmed command\n" +
                        "       2->During automatic returning to the joint point in\n" +
                        "          manual operation intervention mode\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       W-axis limit has been set so that the tow-along tailstock\n" +
                        "       point position will be outside the soft-limit position.\n" +
                        "       [Measures to Take]\n" +
                        "       Shift the W-axis limit position outside if possible.\n" +
                        "       If such setting is not allowed, operate the turret\n" +
                        "       manually and carefully to connect the tailstock so that\n" +
                        "       interference will not occur.\n" +
                        "       Related Specification:Programmable tailstock");

        ExampleItem PARTS_CATCHER_INTERLOCK = new ExampleItem("1265", "PARTS CATCHER INTERLOCK",
                "Parts catcher interlock is activated when an attempt is\n" +
                        "       made to advance or retract the parts catcher.\n" +
                        "       [Code]\n" +
                        "       0->The parts catcher advance command is designated when\n" +
                        "          the Z-axis is not at the positive end limit.  Or an\n" +
                        "          axis move command is designated while the parts catcher\n" +
                        "          is at the advance position.\n" +
                        "       1->The parts catcher advance command is designated when\n" +
                        "          the door is not closed.\n" +
                        "       2->The parts catcher advance or retract command is\n" +
                        "          designated when the touch setter is not at the retract\n" +
                        "          end.\n" +
                        "       3->The parts catcher advance or retract command is\n" +
                        "          designated when the door is not closed.\n" +
                        "       4->The\tparts catcher advance or retract command is\n" +
                        "          designatedwhen the ZB-axis is not at the positive end\n" +
                        "          limit.  ZB-axis move command is designated while the\n" +
                        "          parts catcher is not at the retract end.  Or the parts\n" +
                        "          catcher is placed at a position other than the retract\n" +
                        "          end while the ZB-axis is moving.\n" +
                        "       5->The parts catcher retract command is designated when\n" +
                        "          the parts catcher is not at the swing-up end or while\n" +
                        "          the parts catcher is going down.\n" +
                        "       6->The parts catcher swing up or down command is\n" +
                        "          designated when the parts catcher is not at the\n" +
                        "          advance end or while the parts catcher is retracting.\n" +
                        "       7->A command to move the parts catcher to the workpiece\n" +
                        "          receive position or retract position is designated\n" +
                        "          when the parts catcher is not at the advance end or\n" +
                        "          while the parts catcher is going up.\n" +
                        "       8->A command to swing the parts catcher forward or\n" +
                        "          backward is designated when the parts catcher is not\n" +
                        "          at the advance end or while the parts catcher is\n" +
                        "          retracting.\n" +
                        "       9->A command to swing the parts catcher forward or\n" +
                        "          backward is designated when the parts catcher guide\n" +
                        "          axis is not at the retract end or while the parts \n" +
                        "          catcher is advancing.\n" +
                        "       10->The parts catcher arm retract command is designated\n" +
                        "           when the parts catcher is not at the swing end\n" +
                        "           position in the forward direction or while the parts catcher is \t    \n" +
                        "           advancing.\n" +
                        "       11->The parts catcher guide axis advance command is\n" +
                        "           designated when the parts catcher is not at the swing\n" +
                        "           end position in the backward direction while the parts \n" +
                        "           catcher is advancing\n" +
                        "       12->Parts catcher advanced-retracted command was performed\n" +
                        "           by the state which became disconnected in XA, ZA axis\n" +
                        "           plus limit place. Or, an axis movement instruction was\n" +
                        "           performed by a parts catcher advanced state and it was.\n" +
                        "       13->When it was not a Main spindle stopped state, parts\n" +
                        "           catcher advanced-retracted command was performed. Or,\n" +
                        "           a main spindle rotation instruction was performed by\n" +
                        "           a parts catcher advanced state.\n" +
                        "       14->Except for XA, ZA axis plus variable limit position,\n" +
                        "           a rising order of a parts catcher or a descent order\n" +
                        "           was performed. Or, an axis movement order was performed\n" +
                        "           by a decline condition of a parts catcher.\n" +
                        "       15->When it was not in a Main spindle stop, it performed\n" +
                        "           a rising order of a parts catcher or a descent order.\n" +
                        "           Or, it performed a main spindle rotation order by a\n" +
                        "           decline condition of a parts catcher.\n" +
                        "       16->Though shot work confirmation input had not turned it\n" +
                        "           on by automatic operation, door open-close command was\n" +
                        "           performed.\n" +
                        "       17->Though shot work confirmation input had not turned it\n" +
                        "           on by automatic operation, a rising order of parts\n" +
                        "           catcher was performed.\n" +
                        "       18->Door open-close command was performed by the condition\n" +
                        "           which is not a rise of a parts catcher.\n" +
                        "       < For parts catchers designed for the sub spindle of\n" +
                        "          2-saddle models, parts catcher swing slide model, \n" +
                        "          LT+ sub spindle model >\n" +
                        "       21->The parts catcher advance or retract command is \n" +
                        "           designated when the XB-axis is not at the positive end \n" +
                        "           limit.\n" +
                        "       22->The parts catcher advance or retract command is\n" +
                        "           designated when the ZB-axis is not at the workpiece\n" +
                        "           chuting position.\n" +
                        "       23->The parts catcher advance or retract command is\n" +
                        "           designated when the W-axis is not at a position within\n" +
                        "           the operation enabled range.\n" +
                        "       24->The parts catcher advance or retract command is\n" +
                        "           designated while the sub spindle is rotating.  Or,\n" +
                        "           when there was not a parts catcher in retraction edge,\n" +
                        "           a sub spindle rotation instruction was performed.\n" +
                        "       25->The parts catcher advance or retract command is\n" +
                        "           designated when the door is not closed. However, parts\n" +
                        "           catcher advanced-retracted command was performed by the\n" +
                        "           state that there is not on R side door close in the \n" +
                        "           case of 'LT specification + sub spindle specification'.\n" +
                        "       26->A command to move the XB- or ZB-axis is designated\n" +
                        "           when the parts catcher is not at the retract end.  \n" +
                        "           Or the  parts catcher is placed at a position other \n" +
                        "           than the retract end while the XB- or ZB-axis is moving.\n" +
                        "       27->A command which moves the W-axis toward the workpiece\n" +
                        "           chuting position exceeding the workpiece transfer\n" +
                        "           position is designated when the parts catcher is not\n" +
                        "           at the retract end.\n" +
                        "       30->When there was Za axis in a place on the side of plus\n" +
                        "           from Za axis operation possibility place, parts catcher\n" +
                        "           advanced/retracted command was performed.\n" +
                        "       31->When there was Zb axis in a place on the side of a\n" +
                        "           minus from Zb axis operation possibility place, parts\n" +
                        "           catcher advanced/retracted command was performed.\n" +
                        "       32->When there was Zc axis in a place on the side of plus\n" +
                        "           from Zc axis operation possibility place, parts catcher\n" +
                        "           advanced/retracted command was performed.\n" +
                        "       33->Except for parts catcher retraction end, Za axis\n" +
                        "           transferred in a place on the side of plus from Za\n" +
                        "           axis operation possibility place.\n" +
                        "       34->Except for parts catcher retraction end, Zb axis\n" +
                        "           transferred in a place on the side of a minus from\n" +
                        "           Zb axis operation possibility place.\n" +
                        "       35->Except for parts catcher retraction end, Zc axis\n" +
                        "           transferred in a place on the side of plus from Zc axis\n" +
                        "           operation possibility place.\n" +
                        "       36->When it was not R Main spindle side touch setter\n" +
                        "           retraction end, parts catcher advanced/retracted command\n" +
                        "           was performed.\n" +
                        "       37->Except for parts catcher retraction end, R Main spindle\n" +
                        "           side touch setter is not retraction end.\n" +
                        "       40->When there was ZB axis on place on the side of plus\n" +
                        "           more ZB axis operation possibility place,parts catcher\n" +
                        "           advanced/retracted command was performed.\n" +
                        "       41->When the W-axis was not in the specified W-axis position,\n" +
                        "           a parts catcher advance/retract command was issued.\n" +
                        "           When the parts catcher was not in retract end,\n" +
                        "           a command was issued to move the W-axis in the minus\n" +
                        "           direction beyond the specified W-axis position.\n" +
                        "       42->When it was not touch setter retraction edge, parts\n" +
                        "           catcher command was done. Or, when there was not a\n" +
                        "           parts catcher in retraction edge, a touch setter was\n" +
                        "           not retraction edge and became.\n" +
                        "       43->When it was not parts catcher retraction edge, axis\n" +
                        "           transfer instruction on the side of plus was done from\n" +
                        "           ZB axis operation possibility place.\n" +
                        "       44->When it was not parts catcher retraction edge, XB axis\n" +
                        "           transferred in the direction of a minus.\n" +
                        "       45->Concerning parts catcher limit switch failure detection\n" +
                        "           function, before parts catcher advanced/retraction\n" +
                        "           operation timer progress after parts catcher\n" +
                        "           advanced/retracted command, it became operation \n" +
                        "           completion.");

        ExampleItem LOAD_MONITOR_TOOL_BROKEN = new ExampleItem("1272", "LOAD MONITOR TOOL BROKEN",
                "While monitoring, cutting load has exceeded the second\n" +
                        "       limit level for longer than a designated period of time.\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Code] XXYY\n" +
                        "       XX:part number(hexadecimal)\n" +
                        "       YY=00->Z-axis\n" +
                        "          01->X-axis\n" +
                        "          02->C-axis\n" +
                        "          03->Spindle\n" +
                        "          04->M-tool spindle\n" +
                        "          05->W-axis\n" +
                        "          06->Sub spindle (B-spindle)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)The second limit is changed.\n" +
                        "       2)Time duration to cause the alarm is changed.\n" +
                        "       3)Cutting conditions are changed.\n" +
                        "       4)Chipping of the cutting tool");

        ExampleItem LOAD_MONITOR_COMMAND_EXECUTION = new ExampleItem("1273", "LOAD MONITOR COMMAND EXECUTION",
                "Execution of monitor command is attempted during monitoring.\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Code]\n" +
                        "       1->A load monitor command was issued while being executed.\n" +
                        "       2->A load monitor W command was issued while being executed.\n" +
                        "       [Probable Faulty Locations]Program error\n" +
                        "       Program Example:\n" +
                        "        N100VLMON[1] = 1\tN100VLMON[1] = 1\n" +
                        "        N101G01  X250\tF100 -> N101G01   X250\tF100\n" +
                        "        N102VLMON[2] = 2\tN102VLMON[1] = 0\n" +
                        "        :\t\t\tN103VLMON[2] = 2\n" +
                        "        To perform load monitor W, specify the system variable\n" +
                        "        VWMON.\n" +
                        "       [Measures to Take]\n" +
                        "       Cancel the former monitor command before executing the\n" +
                        "       new one.");

        ExampleItem LASER_MEASUREMENT_DATA_NG = new ExampleItem("1278", "LASER MEASUREMENT DATA NG",
                "Inductosyn pitch error between the encoder read data and\n" +
                        "       the laser measurement data does not satisfy the following:\n" +
                        "        In the X-axis:-0.0254mm - +0.0254mm\n" +
                        "        In the Z-axis:-0.0127mm - +0.0127mm\n" +
                        "       [Code]Hexadecimal number of the difference between the\n" +
                        "       encoder read data and the laser measurement data\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Position encoder\n" +
                        "       2)Inductosyn\n" +
                        "       3)Setting of Inductosyn coupling compensation amount\n" +
                        "       Program Example:\n" +
                        "        G0  X1000\n" +
                        "        LMW X0\n" +
                        "        :");

        ExampleItem IND_CMP_DATA_VERIFY_NG = new ExampleItem("1279", "IND. CMP. DATA VERIFY NG",
                "The difference between the designated inductosyn pitch\n" +
                        "       error compensation data and the read pitch error \n" +
                        "       compensation data does not satisfy the following:\n" +
                        "        In X-axis:-0.006mm - +0.006mm\n" +
                        "        In Z-axis:-0.003mm - +0.003mm\n" +
                        "       [Code]Hexadecimal number of the difference between the\n" +
                        "       designated pitch error compensation data and the read\n" +
                        "       pitch error compensation data.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Position encoder\n" +
                        "       2)Inductosyn\n" +
                        "       3)Setting of Inductosyn coupling compensation amount\n" +
                        "       Program Example\n" +
                        "        G0 X1000\n" +
                        "        LMV X0\n" +
                        "        :");

        ExampleItem HP9825A_SEND = new ExampleItem("1280", "HP9825A SEND",
                "In the communication with the desk top computer HP9825A\n" +
                        "       by the YHP, reception is impossible on the HP9825A side.\n" +
                        "       [Code]1\n" +
                        "       [Probable Faulty Locations]HP9825A\n" +
                        "       Communication line cable\n" +
                        "       RS232C Interface(FRP board)\n" +
                        "       Program Example:\n" +
                        "        G0 X1000\n" +
                        "        LMW X0\n" +
                        "        :");

        ExampleItem HP9825A_RECEIVE = new ExampleItem("1281", "HP9825A  RECEIVE",
                "In the communication with the desk top computer HP9825A\n" +
                        "       of the YHP,the received characters are other than 0 through\n" +
                        "       9, A or E. Or the received data is more than 20 characters. \n" +
                        "       Or an error has occurred in the RS232C interface.\n" +
                        "       [Code]\n" +
                        "       1->The received data is more than 20 characters.\n" +
                        "       2->The received characters are other than 0 through 9,\n" +
                        "          A or E. Codes other than 1 or 2->Error in the RS232C\n" +
                        "          interface\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)HP9825A\n" +
                        "       2)Communication line cable\n" +
                        "       3)RS232C Interface(FRP board)\n" +
                        "       Program Example:\n" +
                        "        G00 X1000\n" +
                        "        LMW X0\n" +
                        "        :");

        ExampleItem HP9825A_RECEIVE_DATA_FORMAT = new ExampleItem("1282", "HP9825A RECEIVE DATA FORMAT",
                "In the communication with the desk top computer HP9825A\n" +
                        "       (YHP), an error has been received on the HP9825A side.\n" +
                        "       Or the received data is more than 8 digits.\n" +
                        "       [Code]\n" +
                        "       1->HP9825A failed to receive signal from laser.\n" +
                        "       2->A request-to-send error has occurred in the HP9825A.\n" +
                        "       3->The received data is more than 8 digits.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)HP9825A; laser interferometer\n" +
                        "       2)Communication line cable\n" +
                        "       3)RS232C Interface\n" +
                        "       Program Example:\n" +
                        "        G00 X1000\n" +
                        "        LMW X0\n" +
                        "        :");

        ExampleItem C_AXIS_COMMAND = new ExampleItem("1283", "C-AXIS COMMAND",
                "C-axis movement command is designated while it is not\n" +
                        "       acceptable.\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Code]\n" +
                        "       1->C-axis is not connected.\n" +
                        "       2->C-axis is not unclamped.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Program error\n" +
                        "       2)Operation error\n" +
                        "       Program Example:\n" +
                        "        N100  M109\t\t C-axis disconnection\n" +
                        "        N101  G00  X100  C100\t C-axis rapid feed to 100-deg\n" +
                        "       \t\t\t\t\t       position\n" +
                        "       Operation Example:\n" +
                        "       C-axis movement command is designated while C-axis is not\n" +
                        "       clamped.");

        ExampleItem SUB_SPINDLE_INTERFERENCE_DISTANCE = new ExampleItem("1299", "SUB SPINDLE INTERFERENCE DISTANCE",
                "The issued command requires the sub spindle headstock \n" +
                        "       (W-axis) and B-turret (ZB-axis) to come closer beyond the\n" +
                        "       interference distance specified by the parameter.\n" +
                        "       (The machine of LT series conducts interference check\n" +
                        "        between L and R spindles.)\n" +
                        "       (In the spec of Turret ZA-W IL. or ZA-W AXIS IL. conducts \n" +
                        "       interference check between ZA-axis and W-axis.)\n" +
                        "       [Code]\n" +
                        "       1->Sub-spindle interference distance.\n" +
                        "       2->The Sub-spindle movement command exceeded Maximum\n" +
                        "          distance between the Steady rest and the Tailstock.\n" +
                        "       3->The Sub-spindle movement command exceeded Minimum\n" +
                        "          distance between the Steady rest and the Tailstock.\n" +
                        "       4->The Steady rest movement command exceeded Maximum\n" +
                        "          distance between the Steady rest and the Tailstock.\n" +
                        "       5->The Steady rest movement command exceeded Minimum\n" +
                        "          distance between the Steady rest and the Tailstock.\n" +
                        "       6->The Axis moved to the interference distance between the\n" +
                        "          Turret and the R-spindle\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Program error\n" +
                        "       2)Parameter set value");

        ExampleItem W_AXIS_MOVEMENT_CONDITION = new ExampleItem("1300", "W-AXIS MOVEMENT CONDITION",
                "A side A command was issued for moving W-axis in G141 mode\n" +
                        "       (sub-spindle coordinate system).\n" +
                        "       Or, a side B command was issued for W-axis movement while\n" +
                        "       G141 mode (sub-spindle coordinate system) is selected on\n" +
                        "       side A.\n" +
                        "       [Code]\n" +
                        "       0->W-axis movement by side A command in G141 mode\n" +
                        "       \t\t\t   (sub spindle coordinate system).\n" +
                        "          W-axis movement by side B command A while G141\n" +
                        "          (sub spindle coordinate system) is active on side A.\n" +
                        "       1->W-axis movement was attempted with the second workhead\n" +
                        "          placed in the lowering position.\n" +
                        "       2->W-axis movement was attempted with the second workhead\n" +
                        "          clamped.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Programming error\n" +
                        "       Program Example:\n" +
                        "        G13\t    G14\n" +
                        "       \t    :\n" +
                        "        :\t    G141\n" +
                        "        G00 W100-> :\t  Code 0\n" +
                        "        :\n" +
                        "       [Measures to Take]\n" +
                        "       Correct the program so that G141 is not selected before\n" +
                        "       W-axis movement by side A command, or that G141 is not\n" +
                        "       selected on side A  when W-axis movement is executed by\n" +
                        "       side B command.\n" +
                        "       1)Specify the W-axis movement command while the second\n" +
                        "         workhead is unclamped.\n" +
                        "         Move the W-axis using G154(W-axis positioning command).");

        ExampleItem PICKOFF_INDEX_POSITION = new ExampleItem("1303", "PICKOFF INDEX POSITION",
                "With pickoff-spindle specification models, pickoff-spindle\n" +
                        "       rotation or pickoff-spindle synchronized rotation with the\n" +
                        "       main spindle is commanded though the pickoff spindle is\n" +
                        "       not indexed. Or the M-tool spindle rotation command or the\n" +
                        "       spindle and M-tool spindle synchronized rotation command\n" +
                        "       is designated when the pickoff spindle is indexed.\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Code]\n" +
                        "       1->The pickoff spindle is not indexed.\n" +
                        "       2->The pickoff spindle is indexed.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Turret indexing command in the program");

        ExampleItem SENSOR_TOUCH_G00 = new ExampleItem("1306", "SENSOR TOUCH G00",
                "The sensor has been brought into contact with the workpiece\n" +
                        "       during G00 mode feed while the execution of the G30 work\n" +
                        "       gauging cycle.\n" +
                        "       In the work gauging cycle, the touch sensor is fed in the\n" +
                        "       G00 mode between the gauging cycle start point and the\n" +
                        "       approach point.  The touch sensor contacts the workpiece\n" +
                        "       surface during this feed mode.\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Probable Faulty Locations]Program error\n" +
                        "       [Measures to Take]\n" +
                        "       Check the target point for the work gauging cycle. (Check\n" +
                        "       whether the programmed target point and the actual workpiece\n" +
                        "       position coincide each other.)\n" +
                        "       Related Specification:Gauging cycle specification");

        ExampleItem SENSOR_NO_TOUCH = new ExampleItem("1307", "SENSOR NO TOUCH",
                "The sensor has not been brought into contact with the\n" +
                        "       workpiece during execution of the G30 work gauging cycle.\n" +
                        "       The sensor failed to contact the workpiece surface when\n" +
                        "       it was fed from the approach point to the imaginary target\n" +
                        "       point. Or, the sensor touched a turret other than the one\n" +
                        "       on which gauging operation is to be carried out.\n" +
                        "       [Object]\n" +
                        "        SYSTEM\n" +
                        "       [Code]\n" +
                        "        1->During execution of the G30,\n" +
                        "           the sensor of other-turret has touched.\n" +
                        "        2->In the G30-order, waiting-time of sensor-state\n" +
                        "       10->During execution of the G30 for diagonal direction,\n" +
                        "           the sensor did not come in contact.\n" +
                        "       The under code is unusually occured.\n" +
                        "       10000->Sensor was touch. But NC has not get the skip-data.\n" +
                        "       20000->NC had not get skip-data of X-axis or Z-axis.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        Program error\n" +
                        "       [Measures to Take]\n" +
                        "        Check the target point for the work gauging cycle.\n" +
                        "        (Check whether the programmed target point and the actual\n" +
                        "         workpiece position coincide each other.)\n" +
                        "       [Related Specification]\n" +
                        "        Gauging cycle specification");

        ExampleItem SENSOR_PROTECT = new ExampleItem("1309", "SENSOR PROTECT",
                "After touching, the sensor moved over the preset distance\n" +
                        "       Or, the turret directly hit the protection limit before\n" +
                        "       it touches the sensor.\n" +
                        "       preset distance:OPTIONAL PARAMETER (GAUGING)\n" +
                        "       \t\tSensor protection distance\n" +
                        "       [Object]AXIS\n" +
                        "       [Code]Sensor input number\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Parameter setting error:The value set at the parameter\n" +
                        "         (long word) No. 24 is too small compared with the\n" +
                        "        feedrate in the gauging cycle.\n" +
                        "       2)Program error, operation error:An attempt is made to\n" +
                        "         execute the program in which the sensor is brought into\n" +
                        "         contact with the object in cycles other than the gauging\n" +
                        "         cycle.  Or the similar operation is attempted.\n" +
                        "       3)Contact failure of slip ring\n" +
                        "       4)Defective sensor element\n" +
                        "       5)Chartering occurs depending on the machining condition.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Reset the alarm in MANUAL mode by turning ON the emergency\n" +
                        "         limit release switch in the control box and take the\n" +
                        "         turret away from the touch setter using the pulse handle.\n" +
                        "         When the turret moves out of the stroke end limit, turn\n" +
                        "         OFF the emergency limit release switch.\n" +
                        "       2)Set a proper value at parameter (long word) No. 24, or\n" +
                        "         reduce the feedrate in the gauging cycle.\n" +
                        "       3)Correct the program so that the sensor is not brought\n" +
                        "         into contact with the object in cycles other than the \n" +
                        "         gauging cycle.\n" +
                        "       4)Check the slip ring.\n" +
                        "       5)Change the sensor element.\n" +
                        "       6)Eliminate chartering during machining.\n" +
                        "         If chartering cannot be eliminated, change the parameter\n" +
                        "         MC USER PARAMETER (MEASUREMENT)\n" +
                        "         Touch setter alarm check ineffect. at retract.\n" +
                        "          0->Sensor contact (or limit switch input) is always\n" +
                        "             monitored.\n" +
                        "          1->Sensor contact (or limit switch input) is monitored\n" +
                        "             only in gauging cycle.");

        ExampleItem ATC_MANUAL_OPERATION_MODE_IMPOSSIBLE = new ExampleItem("1316", "ATC MANUAL OPERATION MODE IMPOSSIBLE",
                "The optional parameter bit for establishing ATC arbitrary\n" +
                        "       operation mode was turned on without selecting the manual\n" +
                        "       operation mode.");

        ExampleItem Y_AXIS_PARAMETER_ILLEGAL = new ExampleItem("1322", "Y-AXIS PARAMETER ILLEGAL",
                "A calculation error occurred when the internal constant is\n" +
                        "       calculated according to Y-axis parameter.\n" +
                        "       [Code]XX\n" +
                        "       XX:\n" +
                        "        Bit0->Integer overflow\n" +
                        "        Bit1->Exponent underflow\n" +
                        "        Bit2->Exponent overflow\n" +
                        "        Bit3->Square root of a negative value\n" +
                        "        Bit4->Zero divide error\n" +
                        "        Bit5->Overflow of SIN, COS, TAN, or COT value\n" +
                        "       [Probable Faulty Locations]Wrong Y-axis parameter setting");

        ExampleItem YS_AXIS_POSITION = new ExampleItem("1323", "YS AXIS POSITION", "Except for Y-axis mode, though YS axis place was not in \n" +
                "       turning position of system parameter, they went along axis\n" +
                "       movement command.\n" +
                "       Except for Y-axis mode, though YS axis place is not in YS\n" +
                "       axis carriage return place, they went along axis movement\n" +
                "       command (YS axis carriage return positioning specification)\n" +
                "       [Object]SYSTEM\n" +
                "       [Probable Faulty Locations]\n" +
                "       1)The system parameter data for specifying YS-axis spindle\n" +
                "         center position is changed.\n" +
                "       2)After installation of NC software, axis movement was\n" +
                "         attempted before setting the system parameter data for\n" +
                "         YS-axis spindle center position.\n" +
                "       3)In YS axis carriage return positioning specification, \n" +
                "         after YS axis carriage return place was changed, they\n" +
                "         went along axis movement command by the state which is\n" +
                "         not in YS axis carriage return place.\n" +
                "       [Measures to Take]\n" +
                "       1)Change the system parameter data to the original data.\n" +
                "         Or, bring the YS-axis to the newly set spindle center\n" +
                "         position by executing G138 (Y-axis mode ON) and G136 \n" +
                "         (Y-axis mode OFF).\n" +
                "         If the machine is provided with home position function\n" +
                "         and ATC unit, specify G21 (home position command) HP=4,5\n" +
                "         to return the saddle to the return point before issuing\n" +
                "         the axis movement command again.\n" +
                "       2)Set the system parameter data for YS-axis spindle center\n" +
                "         position.\n" +
                "       3)In YS axis carriage return positioning specification,\n" +
                "         Y-axis mode ON/OFF is performed. \n" +
                "         Or, in order that present YS axis place results in a\n" +
                "         carriage return place, YS axis carriage return place\n" +
                "         is modified.");

        ExampleItem ADAPTIVE_CONTROL_COMMUNICATION_ERROR = new ExampleItem("1328", "ADAPTIVE CONTROL COMMUNICATION ERROR",
                "An abnormality occurred during communication in adaptive\n" +
                        "       control mode.\n" +
                        "       [Code]XYYZZ\n" +
                        "       X:\n" +
                        "        0->Error code of four or less digits\n" +
                        "         YYZZ: Adaptive control communication error number\n" +
                        "        1->Open command ended abnormally.\n" +
                        "       YY: Error code\n" +
                        "       ZZ: Detailed error code\n" +
                        "          If YY=ZZ=0, the open command failed to end within a\n" +
                        "       \t       preset period of time.\n" +
                        "        2->Forced close was not completed within a preset period\n" +
                        "           of time");

        ExampleItem SHIFT_AMOUNT_ERROR = new ExampleItem("1329", "SHIFT AMOUNT ERROR",
                "The shift amount is unsuitable.\n" +
                        "       [Code]\n" +
                        "       1->The shift amount is not 0 although shift amount is not\n" +
                        "          overlapped.\n" +
                        "       2->The CON value fell to a negative value after addition\n" +
                        "          of shift amount.\n" +
                        "       3->The CON value exceeded the plus variable limit after\n" +
                        "          addition of shift amount.\n" +
                        "       4->The CON value exceeded the minus variable limit after\n" +
                        "          addition of shift amount.\n" +
                        "       5->The shift amount does not solidarity in the anticus\n" +
                        "          which turns a shift amount into a fixation state and \n" +
                        "          posterior.");

        ExampleItem SPINDLE_BELT_SLIP = new ExampleItem("1332", "SPINDLE BELT SLIP",
                "On the machine with the function for detecting spindle\n" +
                        "       belt slip, belt slip was detected.\n" +
                        "       [Code]\n" +
                        "       1->The number of revolution ratio set (at the parameter)\n" +
                        "          as a criterion for detecting belt slip continued for\n" +
                        "          the time also set (at the parameter) as the belt slip\n" +
                        "          detection time.");

        ExampleItem APA_ILLEGAL = new ExampleItem("1334", "APA ILLEGAL",
                "It was detected that a present-position of MCS differs\n" +
                        "       from a position-order of NC.\n" +
                        "       Please contact to OKUMA, after copying the buffering-data\n" +
                        "       of NC-axis to FD by the attachment-document.");

        ExampleItem LOAD_MONITOR_W_OVER_LOAD = new ExampleItem("1338", "LOAD MONITOR W OVER LOAD",
                "While the load monitor W function is activated, the load\n" +
                        "       ratio of X-axis/Z-axis or Z-axis/X-axis exceeds the limit\n" +
                        "       value. In the automatic mode, each of the programmed\n" +
                        "       monitoring sections is controlled by the limit value S.\n" +
                        "       The value obtained by the following formula exceeded the\n" +
                        "       limit value S.\n" +
                        "       VWMON[*]=1 (Z-axis torque command value/X-axis torque\n" +
                        "       command value)*100 (%)\n" +
                        "       VWMON[*]=1 (X-axis torque command value/Z-axis torque\n" +
                        "       command value)*100 (%)\n" +
                        "       [Object]SYSTEM, AXIS\n" +
                        "       [Code]Load monitor W supervising part No. in hexadecimal");

        ExampleItem DOOR_INTERLOCK_RESET = new ExampleItem("1339", "DOOR INTERLOCK RESET",
                "On the machine intended for CE marking, when the state of\n" +
                        "       servo off by door-open returned to the state of servo on\n" +
                        "       by door-close, the following conditions are not met.\n" +
                        "       1)In C-axis control, the position of Main spindle  is at\n" +
                        "         least 0.36 (equivalent to 0.5mm) away from the switch\n" +
                        "         OFF position.\n" +
                        "       2)The spindle or M-tool spindle in the state of synchronized\n" +
                        "         rotation, or flat turning is at least 0.36 (equivalent to\n" +
                        "         0.5mm) away from the switch OFF position.\n" +
                        "       [Object]SYSTEM, M-TOOL SPINDLE");

        ExampleItem G21_IMPOSSIBLE = new ExampleItem("1345", "G21 IMPOSSIBLE",
                "Axis movement to the tool change position G21 is issued\n" +
                        "       without satisfying the conditions for executing the command. \n" +
                        "       (G21 command is also issued in execution of ATC macro\n" +
                        "       command G171 and M321.)\n" +
                        "       [Code]X\n" +
                        "       1->There are not a present place at the time of an\n" +
                        "          instruction of G21 HP=1,2,3 and the translocation target\n" +
                        "          place which has set on system parameter within movable\n" +
                        "          range limit 1. Or,a turret index state has resulted in \n" +
                        "          the following state.\n" +
                        "        HP=1 .... Turret is not indexed to ATC position.\n" +
                        "       \t   LB15II/LB35II-MATC-Y Turret T2-T4 T6-T8\n" +
                        "       \t   LU45-MATC-Y Turret T2\n" +
                        "       \t   MacTurn Turret T1\n" +
                        "        HP=2 .... Turret is not indexed to ATC position .\n" +
                        "       \t   LB15II/LB35II-MATC-Y Turret T5\n" +
                        "       \t   LU45-MATC-Y turret T3\n" +
                        "       \t   MacTurn Turret T3\n" +
                        "        HP=3 .... T1 is not indexed to ATC position \n" +
                        "       \t   on LB15II/LB35II-M\n" +
                        "       \t   ATC-Y and LU45-MATC-Y turret.\n" +
                        "       3->G21 was issued without opening the shutter.\n" +
                        "       5->There is not the translocation target place that there\n" +
                        "          are not a present place at the time of G21 HP=4,5\n" +
                        "          instructions and the translocation target place which\n" +
                        "          has set on system parameter within movable range limit\n" +
                        "          1 within stroke end limit.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)There is an error in tool change position data or working\n" +
                        "         range limit 1 setting data. The G21 HP=* command was \n" +
                        "         given after correcting only the tool change position\n" +
                        "         data or working range limit 1 setting data.\n" +
                        "       2)With HP = 1, the L-tool mounted station is indexed to\n" +
                        "         the tool change position. With HP = 2, the facing tool \n" +
                        "         mounted station is indexed to the tool change position.\n" +
                        "         (With MacTurn,M-tool mounted station is indexed to the\n" +
                        "          tool change position.)\n" +
                        "         With HP = 3,side machining tool is indexed to the tool\n" +
                        "         change position.\n" +
                        "         If the turret station having the tool type corresponding\n" +
                        "         to G21 HP=* is not indexed to the ATC position, this\n" +
                        "         alarm occurs.\n" +
                        "         Satisfy the turret indexing conditions before issuing\n" +
                        "         G21 HP=* command.\n" +
                        "       3)G21 HP=* command cannot be issued without opening the\n" +
                        "         shutter Issue the shutter open command before issuing \n" +
                        "         G21 HP=* command.");

        ExampleItem STM_TIME_OVER = new ExampleItem("1347", "STM TIME OVER",
                "The STM operation time exceeded the parameter-set time.\n" +
                        "       [Parameter] OPTIONAL PARAMETER (CYCLE TIME OVER CHECK)\n" +
                        "       \t     STM time over timer (0.1s)\n" +
                        "       [Object]SYSTEM\n" +
                        "       [Code]Parameter-set time in hexadecimal\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)The NC received no answer to the STM command being\n" +
                        "         executed when this alarm occurred.\n" +
                        "       Program Example:\n" +
                        "          :\n" +
                        "         M03 M42 S1000 T0303\n" +
                        "          :\n" +
                        "       [Measures to Take]\n" +
                        "       1)Display the check screen to see if the input signal is\n" +
                        "         sent in answer to the STM command executed on occurrence\n" +
                        "         of the alarm. If two or more commands are given, give\n" +
                        "         the commands one by one in MDI operation to find out\n" +
                        "         which STM command causes the alarm.\n" +
                        "       2)If \"0\" is set at the OPTIONAL PARAMETER (CYCLE TIME OVER\n" +
                        "         CHECK) Cycle/STM time over alarm level,\n" +
                        "         the alarm B 2295 STM time over occurs instead of this \n" +
                        "         alarm.");

        ExampleItem CYCLE_TIME_OVER = new ExampleItem("1348", "CYCLE TIME OVER",
                "One cycle time (from start to M02 or M30) exceeded the\n" +
                        "       parameter-set time.\n" +
                        "       [Parameter]\n" +
                        "       OPTIONAL PARAMETER (CYCLE TIME OVER CHECK)\n" +
                        "        Cycle time over timer (s)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)The part program has a long machining time. Or, the part\n" +
                        "         program failed to end because a programmed operation was\n" +
                        "         not completed.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Review the machining time in the part program or check\n" +
                        "         the machining operations.\n" +
                        "       2)if \"0\" is set at the OPTIONAL PARAMETER (CYCLE TIME OVER\n" +
                        "         CHECK) Cycle/STM time over alarm level.\n" +
                        "         the alarm C 3206 Cycle time over occurs instead of this\n" +
                        "         alarm.");

        ExampleItem CONTOUR_GENERATION_IMPOSSIBLE = new ExampleItem("1349", "CONTOUR GENERATION IMPOSSIBLE",
                "After locating the X-axis in a negative position by G00\n" +
                        "       or G01 command with X-C coordinates, contour generation\n" +
                        "       was commanded. Or, the contour generation command includes\n" +
                        "       a negative X-axis value.");

        ExampleItem MEASUREMENT_SYSTEM_ERROR = new ExampleItem("1353", "MEASUREMENT SYSTEM ERROR",
                "Concerning the optical measure within a machine specification,\n" +
                        "       ERROR signal changed on ON -> OFF in G30 cyclic practices.\n" +
                        "       When a power supply of an optical measure within a machine\n" +
                        "       sensor was turned on by a manually operated operational\n" +
                        "       mode condition, ERROR signal became \"OFF\".");

        ExampleItem TOW_ALONG_STEADY_REST_CONNECT = new ExampleItem("1355", "TOW ALONG STEADY REST CONNECT",
                "[Code]\n" +
                        "       1->Traverse Command is issued when engaged code is on.\n" +
                        "          Measures: Issue traverse command through Pulse Handle.\n" +
                        "       2->G00, G01, G03, G31, G32, G33, G34, or G35 is issued\n" +
                        "          during Automatic Tow-Along Steady Rest engaging cycle.\n" +
                        "       3->Traverse Command, Not ZA-Traverse Command, is issued\n" +
                        "          during Automatic Tow-Along Steady Rest engaging cycle.\n" +
                        "       4->While automatic Tow-Along Steady Rest is connection mode,\n" +
                        "          axis command of the negative direction from parameter\n" +
                        "          set deta was designated.\n" +
                        "       5->While automatic Tow-Along Steady Rest is connection\n" +
                        "          mode and a touch setter was not a retract position,\n" +
                        "          axis command of the negative direction from parameter\n" +
                        "          set data was designated.\n" +
                        "       [ Measures to take ]\n" +
                        "       1->During a Steady Rest connection mode, axis movement is\n" +
                        "          only possible by pulse handle.");

        ExampleItem STEADY_REST_TORQUE_OVER = new ExampleItem("1356", "STEADY REST TORQUE OVER",
                "[Code]\n" +
                        "       1->The state where the actual torque is larger than 70%\n" +
                        "          of ZA-axis servomotor rating continued for 0.1s or over.\n" +
                        "       (Movement of steady rest was attempted while the steady\n" +
                        "        rest lower base was clamped.)");

        ExampleItem POSITIONING_UNCERTAIN = new ExampleItem("1357", "POSITIONING UNCERTAIN",
                "The input signal notifying that positioning of the spring\n" +
                        "       alignment tool is not confirmed went OFF.");

        ExampleItem NC_TAILSTOCK_ADVANCE_ERROR = new ExampleItem("1367", "NC TAILSTOCK ADVANCE ERROR",
                "Out advance of the NC tailstock.\n" +
                        "       Concerning Sub spindle-tailstock Control specification,\n" +
                        "       out advance of the NC tailstock.\n" +
                        "       Concerning W axis Cut-tailstock Control specification,\n" +
                        "       out advance of the NC tailstock.\n" +
                        "       [Code]\n" +
                        "       1->When the command position(CON)does not reach the\n" +
                        "          command torque before entering the sizing position\n" +
                        "          area1,the command torque is generated within the\n" +
                        "          tailstock quill expand/shrink Time.\n" +
                        "       2->The torque higher than the set thrust is generated\n" +
                        "          when the current position(APA) is moved to the +side\n" +
                        "          viewed from the sizing position area2.\n" +
                        "          the tailstock to the sizing position was ordered before \n" +
                        "          more than  the approach position.\n" +
                        "       3->The toraue exceeding the threshold is generated\n" +
                        "          when the tailstock moves or the time constant(T1+T2)*\n" +
                        "          1.25+48 msec from the approach position or movement\n" +
                        "          start position.\n" +
                        "       4->The current position is not within the sizing position\n" +
                        "          area while the tailstock is in sizing position status.\n" +
                        "       5->The torque higher than the set thrust is generated\n" +
                        "          after lower.\n" +
                        "       6->The torrue over for the ball screw Inertia.\n" +
                        "       7->Real thrust is outside the tolerance of the instruction\n" +
                        "          thrust.\n" +
                        "       8->Difference between sizing position and current position\n" +
                        "          values has exceeded the allowable limit.\n" +
                        "       9->When the tailstock wasn't in A position,\n" +
                        "          the sizing command in position B was ordered.\n" +
                        "       10->The motor torque came off from the threshold\n" +
                        "           by 'work position state'.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       A workpiece shorter than the required one is mounted.\n" +
                        "       [Measures to Take]\n" +
                        "       Re-positon the tailstock closer to the workpiece.");

        ExampleItem CUTTING_ERROR = new ExampleItem("1376", "CUTTING ERROR",
                "The load detected by the non-load detection function is\n" +
                "       lower than the 2nd lower limit continuously for a preset\n" +
                "       length of time.\n" +
                "       The length of time and the 2nd lower limit value are set\n" +
                "       for the following parameters.\n" +
                "       Optional parameter (LOAD MONITOR 2)\n" +
                "        Low load alarm duration\n" +
                "        2st lower limit automatic setting para.\n" +
                "       [Probable Faulty Locations]\n" +
                "       Damaged tool tip\n" +
                "       [Measures to take]\n" +
                "       Change tool chip\n" +
                "       [Related Specifications]\n" +
                "       Non load detection function");

        ExampleItem TOW_ALONG_STEADY_REST_INTERFERENCE_POSITION = new ExampleItem("1393", "TOW-ALONG STEADY REST INTERFERENCE POSITION",
                "[Code]\n" +
                        "       None->Programmable tailstock (Tow-Along type, NC tailstock\n" +
                        "             type) was moved on interference position with\n" +
                        "             Tow-Along Steady Rest.\n" +
                        "       1->Designated Tow-Along Steady Rest command is on\n" +
                        "          interference position with Tow-Along tailstock.\n" +
                        "       [Measures to take]\n" +
                        "       Check programmable tailstock command(G152)");

        ExampleItem HOME_POSITION_MOVEMENT_INTERLOCK = new ExampleItem("1412", "HOME POSITION MOVEMENT INTERLOCK",
                "It performed a home position command to HP1, HP2 in main\n" +
                        "       spindle rotation.\n" +
                        "       Or, when turret had not divided the turret-number that\n" +
                        "       the loader could approach, the command of moving\n" +
                        "       home-position from the loader was performed.\n" +
                        "       [Code]\n" +
                        "       1->Main spindle did not hang-up.\n" +
                        "       2->There was not turret in the position that loader could\n" +
                        "          approach.\n" +
                        "       [Measures to take]\n" +
                        "       1)It performs a home position command in a Main spindle \n" +
                        "         stop.\n" +
                        "       2)Divide turret in the position that loader could approach.");

        ExampleItem BARRIER_AREA = new ExampleItem("1426", "BARRIER AREA",
                "Axis entered into a barrier area.\n" +
                        "       [Code]\n" +
                        "       1->Concerning MacTurn30, axis entered into a barrier area\n" +
                        "          by axis movement of X-Y plane in Y-axis mode(in G138\n" +
                        "          command).\n" +
                        "       3->In the spec of Sub-Spindle Unit Barria, axis move to\n" +
                        "          the barrier area. The interference range is set \n" +
                        "          by the next screen\n" +
                        "            \"OPTIONAL PARAMETER Y-axis BARRIER\"  (NO.4-6)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1) Barrier area boundary is located on a point that added\n" +
                        "          barrier length set data added minus stroke end limit\n" +
                        "          position data.\n" +
                        "          Axis entered into a barrier area beyond boundary.\n" +
                        "          By manual jog feed, please move axis out from a barrier\n" +
                        "          area.\n" +
                        "       Barrier length set data\n" +
                        "       X-axis: optional parameter long word No.66(It is Radius)\n" +
                        "       Y-axis: optional parameter long word No.67\n" +
                        "       Z-axis: optional parameter long word No.68");

        ExampleItem SAFETY_SPEED_OVER = new ExampleItem("1431", "SAFETY SPEED OVER",
                "Concering velocity supervision automatic formatting\n" +
                        "       on the side of NC, Axis-speed surpassed a safety speed\n" +
                        "       for the speed supervision which has set by data file for\n" +
                        "       Safety-Speed-Monitor.\n" +
                        "       [Object]Axis\n" +
                        "       [Code]X\n" +
                        "       1->Concering velocity supervision automatic formatting\n" +
                        "          on the side of NC, Axis-speed surpassed a safety speed\n" +
                        "          for the speed supervision which has set by data file\n" +
                        "          for Safety-Speed-Monitor.\n" +
                        "       [Probable Faulty Location]\n" +
                        "       NC software\n" +
                        "       Data file for Safety-Speed-Monitor");

        ExampleItem SAFETY_MONITOR_ERROR_DETECTION = new ExampleItem("1432", "SAFETY MONITOR ERROR DETECTION",
                "Safety monitor detected speed-over.\n" +
                        "       Or, By some cause, it resulted in the state as errar signal\n" +
                        "       turned on.\n" +
                        "       [Code]Corresponding guard number\n" +
                        "       [Probable Faulty Location]\n" +
                        "       Safety monitor\n" +
                        "       NC software\n" +
                        "       Data file for Safety monitor");

        ExampleItem TURRET_INTERFERANCE = new ExampleItem("1435", "TURRET INTERFERANCE",
                "The ZB-axis has moved to a position shorter than the preset\n" +
                "       ZB-axis work transfer point under the new LT control,\n" +
                "       while the B-turret is not indexed to the station number\n" +
                "       specified by T1 or parameter.\n" +
                "       [Probable Faulty Locations]\n" +
                "       1)Parameter-Setting error\n" +
                "       2)Operation/Program error\n" +
                "       [Parameter]\n" +
                "       Parameter Word No.64");

        ExampleItem START_UP_APA_DEVIATION = new ExampleItem("1436", "START UP APA DEVIATION",
                "After a power supply input, APA deviation became excessive\n" +
                        "       at the time of power sequent execution.\n" +
                        "       Or, the value of detector coupling compenzation was not\n" +
                        "       set in ABSO-SCALE specification.\n" +
                        "       [Object] AXIS\n" +
                        "       [Probable Faulty Location]\n" +
                        "       NC Software\n" +
                        "       Value of detector coupling compenzation (System Parameter)");

        ExampleItem STEADY_REST_TAILSTOCK_INTERLOCK = new ExampleItem("1440", "STEADY REST-TAILSTOCK INTERLOCK",
                "[Code]\n" +
                        "        1->A position command of programable tailstock is over\n" +
                        "           than maximum distance of a steady rest and a tailstock.\n" +
                        "        2->A position command of programable tailstock is less\n" +
                        "           than minimum distance of a steady rest and a tailstock.\n" +
                        "        3->The Steady rest movement command exceeded Maximum\n" +
                        "           distance between the Steady rest and the Tailstock.\n" +
                        "        4->The Steady rest movement command exceeded Minimum\n" +
                        "           distance between the Steady rest and the Tailstock.\n" +
                        "        5->It started moving to the position in which it interfered\n" +
                        "           with Steady rest and Tailstock.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        Program error\n" +
                        "       [Measures to Take]\n" +
                        "       Please turn the instruction-position on a right value.");

        ExampleItem SAFETY_SPEED_CLAMP = new ExampleItem("1441", "SAFETY SPEED CLAMP",
                "The feed rate of C-axis was about to surpass a\n" +
                        "       restrictive value at the time of G102 or G103 command\n" +
                        "       execution by the state which an object guard of\n" +
                        "       Main-spindle opened.\n" +
                        "       [Code]X\n" +
                        "       1->At the time of G102 or G103 command execution, the\n" +
                        "          feed rate of C-axis was about to surpass a restrictive\n" +
                        "          value.\n" +
                        "       [Measures to Take]\n" +
                        "       Please close an object guard of Main-spindle.");

        ExampleItem HEAVY_WORK_DATA_NOT_FOUND = new ExampleItem("1453", "HEAVY WORK DATA NOT FOUND",
                "There are not \"Heavy Work DATA\" that selected by the\n" +
                        "       parameter in axis-data-file.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Axis data file");

        ExampleItem TEMP_RISE_LIMIT_OVER = new ExampleItem("1460", "TEMP RISE LIMIT OVER",
                "Temperature rise value has exceeded the limit value.\n" +
                        "       [Character-String]None\n" +
                        "       [Code]XYY\n" +
                        "       X=0->Temperature rise value has exceeded the limit value.\n" +
                        "       X=1->Thermal deviation compensation parameter A has not\n" +
                        "            been set.\n" +
                        "       YY->Thermal deviation number, or block number of\n" +
                        "           compensation parameter A\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1)Measured temperature\n" +
                        "       2)Thermal deviation compensation parameter");

        ExampleItem SPINDLE_WENT_INTO_TRANSPORTATION_BARRIER = new ExampleItem("1463", "SPINDLE WENT INTO TRANSPORTATION BARRIER",
                "Spindle entered into a barrier-area that set by the\n" +
                        "       parameter of work transportation barrier data.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Program erro");

        ExampleItem SPINDLE_LOW_ACCELERATION_MODE_CONDITION = new ExampleItem("1465", "SPINDLE LOW ACCELERATION MODE CONDITION",
                "M671 or M672 command was issued while the spindle\n" +
                        "       was not stopped.\n" +
                        "       [Object] None\n" +
                        "       [Character-string] None\n" +
                        "       [Code] None");

        ExampleItem HOB_CUTTING_OVER_LOAD = new ExampleItem("1466", "HOB CUTTING OVER LOAD",
                "Spindle,M-spindle,Y-axis had big DIFF value during HOB\n" +
                        "       cutting.\n" +
                        "       [CODE]\n" +
                        "       1->Main spindle or Sub spindle DIFF over\n" +
                        "       2->MA-axis or MB-axis DIFF over\n" +
                        "       3->Monitoring-axis(XA-axis or YB-axis) DIFF over\n" +
                        "       4->Main spindle or Sub spindle over load\n" +
                        "       5->MA-axis or MB-axis over load");

        ExampleItem POSITION_SCALE_ABNORMAL_XS_AXIS = new ExampleItem("1467", "POSITION SCALE ABNORMAL XS AXIS",
                "he Xs-axis(cam-axis) position encoder(optical scale)\n" +
                        "       is faulty.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]\n" +
                        "       [Code]None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty optical scale or pulse sinnal unit\n" +
                        "       [Measures to Take]\n" +
                        "       Replace the faulty scale unit.\n" +
                        "       [Note]\n" +
                        "       This alarm can be cleared by reseting the NC.");

        ExampleItem SERVO_AMP_ABNORMAL_XS_AXIS = new ExampleItem("1468", "SERVO AMP ABNORMAL XS AXIS",
                "The Xs-axis(cam-axis) servo controller is faulty.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty servo controller(fuse blown)\n" +
                        "       [Measures to Take]\n" +
                        "       Replace the unit(change the fuse).\n" +
                        "       [Note]\n" +
                        "       The alarm state can be cleared by turning off the power\n" +
                        "       and turn it back on again.");

        ExampleItem APA_VEROCITY_XS_AXIS = new ExampleItem("1469", "APA VEROCITY XS AXIS",
                "Actual position velocity of Xs-axis exceeds 15 m/min.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]Hexadecimal of APA velocity(unit:0.2 um/s)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty position encoder.\n" +
                        "       The command given in the synchronization mode is too large.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the position encoder.\n" +
                        "       Review the cutting condition such as cam profit and\n" +
                        "       spindle speed.");

        ExampleItem APA_RANGE_XS_AXIS = new ExampleItem("1470", "APA RANGE XS AXIS",
                "Actual position reachea the soft-limit during\n" +
                        "       synchronization operation (in other than learning).\n" +
                        "       During learning operation, actual position data exceeds\n" +
                        "       the value which is the sum of the maximum position command\n" +
                        "       value and the parameter setting (XS AXIS SYATEM PARAMETER \n" +
                        "       NO.6) or becomes smaller than the value which is the \n" +
                        "       difference between the minimum position command value and\n" +
                        "       the parameter setting (XS AXIS SYATEM PARAMETER NO.6).\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]\n" +
                        "       1->The actual position data exceeds the allowable range\n" +
                        "          in the positive direction.\n" +
                        "       2->The actual position data is smaller than the smallest\n" +
                        "          limit of the allowable range in the negative direction.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The command given in the synchronization mode is too large.\n" +
                        "       The compensation data exceeds the proper amount during\n" +
                        "       lerning operation.\n" +
                        "       Faulty position encoder.\n" +
                        "       [Measures to Take]\n" +
                        "       Review the cutting conditions.\n" +
                        "       Review the setting of the learning operation monitoring\n" +
                        "       parameter (XS AXIS LEARNING CONTROL PARAMETER No.6).\n" +
                        "       Check the position encoder.");

        ExampleItem CON_VEROSITY_XS_AXIS = new ExampleItem("1471", "CON VEROSITY XS AXIS",
                "When the Xs-axis(cam-axis) machining data and the\n" +
                        "       compensation data are calculated and set to the memory,\n" +
                        "       the spindle exceeds the allowable limit.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]Hexademical of the allowable spindle speed\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The spindle speed designated optionally for developing\n" +
                        "       the profile is too large.\n" +
                        "       The major diameter or cam lift amount designated to\n" +
                        "       define the cam profile is too large.\n" +
                        "       [Measures to Take]\n" +
                        "       Review the spindle speed designated optionally for\n" +
                        "       developing the profile.\n" +
                        "       Review the cam profile definition file.");

        ExampleItem STROKE_END_OVER_XS_AXIS = new ExampleItem("1472", "STROKE END OVER XS AXIS",
                "The Xs-axis(cam-axis) reaches the travel end.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]\n" +
                        "       1->Emergency limit in the positive direction\n" +
                        "       2->Emergency limit in the negative direction\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The Xs-axis soft-limit is set outside the range defined\n" +
                        "       by the travel limit to be detected by the limit switch.\n" +
                        "       [Measures to Take]\n" +
                        "       1)Select the manual mode and reset the NC while pressing\n" +
                        "         the Xs-axis emergency limit release button provide at\n" +
                        "         the side of the operation panel to clear the alarm state.\n" +
                        "       2)Press the Xs-axis fog button while holding down the\n" +
                        "         Xs-axis emergency limit release button.\n" +
                        "         The Xs-axis is automatically positioned inside the\n" +
                        "         allowable travel range.\n" +
                        "       3)Set the soft-limits correctly.");

        ExampleItem ACTUAL_POSITION_INITIALIZE_ERROR_XS_AXIS = new ExampleItem("1473", "ACTUAL POSITION INITIALIZE ERROR XS AXIS",
                "Xs-axis(cam-axis) has not returned to the zero point\n" +
                        "       correctly.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]\n" +
                        "       1->The Xs-axis fails to enter the zero return zone.\n" +
                        "       2->The zero point is not found.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The zero return range signal and the zero return signal\n" +
                        "       are not input.\n" +
                        "       Faulty optical scale or pulse signal unit.\n" +
                        "       [Measures to Take]\n" +
                        "       Check the input of the zero return range signal and the\n" +
                        "       zero point signal.");

        ExampleItem LEARNING_CONTROL_ERROR_XS_AXIS = new ExampleItem("1474", "LEARNING CONTROL ERROR XS AXIS",
                "Any of the following errors occurred during learning\n" +
                        "       control mode.\n" +
                        "       - The learning command is given while in asynchronization\n" +
                        "         control mode.\n" +
                        "       - Learning does not finish within the set learing quit\n" +
                        "         time (XS AXIS LEARNING CONTROL PARAMETER No.5).\n" +
                        "       - Overflow of the compensation value to be obtained in\n" +
                        "         the learning control mode.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]\n" +
                        "        1->This error does not occur usually.\n" +
                        "        2->Illegal parameter setting value.\n" +
                        "        3->This error does not occur usually.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "        1->Learning command given during asynchronous control mode.\n" +
                        "        2->Learning time over.\n" +
                        "        3->Compensation value overflow.\n" +
                        "       [Measures to Take]\n" +
                        "       Set a large value for learning quit time\n" +
                        "          (XS AXIS LEARNING CONTROL PARAMETER No.5).");

        ExampleItem CAM_EXECUTE_DATA_NOT_SELECT_XS_AXIS = new ExampleItem("1475", "CAM EXECUTE DATA NOT SELECT XS AXIS",
                "When the synchronization command is designated, the cutting\n" +
                        "       data has not been transferred to the PSC board.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Synchronization mode A ... Program error (entry to the\n" +
                        "       \t\t\t   synchronization mode a is\n" +
                        "       \t\t\t   designated without the FCALL\n" +
                        "       \t\t\t   command.)\n" +
                        "       Synchronization mode B ... Operator's error (entry to the\n" +
                        "       \t\t\t   synchronization mode a is\n" +
                        "       \t\t\t   designated without loading the\n" +
                        "       \t\t\t   files.)\n" +
                        "       [Measures to Take]\n" +
                        "       Review the program.\n" +
                        "       Load the first by displaying the CAM EXECUTE PARAMETER\n" +
                        "       screen.");

        ExampleItem LEARNING_CONTROL_COMMAND_XS_AXIS = new ExampleItem("1476", "LEARNING CONTROL COMMAND XS AXIS",
                "The learning control commands is designated while the\n" +
                        "       control mode is not the synchronization mode.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]1\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Program error\n" +
                        "       [Measures to Take]\n" +
                        "       Review the program.");

        ExampleItem SYNCHRONOUS_MODE_COMMAND = new ExampleItem("1477", "SYNCHRONOUS MODE COMMAND",
                "The synchronous mode operation command is designated\n" +
                        "       while spindle rotation command has not been designated.\n" +
                        "       The synchronous operation start command is designated in\n" +
                        "       the MDI mode.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]\n" +
                        "       1->The synchronous mode operation command is designated\n" +
                        "          while spindle rotation command has not been designated.\n" +
                        "       2->The synchronous operation start command is designated\n" +
                        "          in the MDI mode.\n" +
                        "       4->The different synchronous operation start command was\n" +
                        "          executed while synchronously operation.\n" +
                        "       5->The synchronous operation start command was executed\n" +
                        "          though the cam processing data is a unforwarding.\n" +
                        "       6->The synchronous operation start command was executed while\n" +
                        "          controlling the spindle speed variation.\n" +
                        "       7->The spindle speed variation control command was executed\n" +
                        "          while synchronously operation.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       1->Program error\n" +
                        "       2->Operator's error\n" +
                        "       [Measures to Take]\n" +
                        "       Review the program.");

        ExampleItem CHUCK_COORDINATES_UNMATCH = new ExampleItem("1478", "CHUCK COORDINATES UNMATCH",
                "ACC coordinates (Cutting Station or Select Station) is not\n" +
                        "       corresponding.\n" +
                        "       [Object] Turret\n" +
                        "       01:A-turret\n" +
                        "       02:B-turret\n" +
                        "       [Character-string] None\n" +
                        "       [Code] X\n" +
                        "       X=1->The axis movement instruction was executed, while chuck\n" +
                        "            Coordinate system and Cutting Station chuck was not\n" +
                        "            corresponding.\n" +
                        "       X=2->The executed coordinate system instruction was not\n" +
                        "            corresponding in Cutting Station chuck.\n" +
                        "       X=3->The system variable (Origin Offset, Origin Shift, Chuck)\n" +
                        "            instruction was executed, while chuck Coordinate system\n" +
                        "            and Cutting Station chuck was not corresponding.\n" +
                        "       [Related Specifications]\n" +
                        "       ACC Specification");

        ExampleItem PSCB_COMMAND_ERROR = new ExampleItem("1479", "PSCB COMMAND ERROR",
                "More than one command is sent simultaneously to the PSC\n" +
                        "       board. This error does not occur usually.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]None");

        ExampleItem DIFF_OVER_XS_AXIS = new ExampleItem("1480", "DIFF OVER XS AXIS",
                "Follow-up error of the Xs-axis(cam-axis) exceeds the\n" +
                        "       allowable limit.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]Hexadecimal of follow-up error(units:0.2 us)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Mechanical ploblems such as large slide resistance and\n" +
                        "       collision of the turret.\n" +
                        "       [Measures to Take]\n" +
                        "       Remove the cause of the mechanical ploblems and reduse\n" +
                        "       slide resistance.");

        ExampleItem DRIFTCOMPENSATION_VALUE_OVER = new ExampleItem("1481", "DRIFTCOMPENSATION VALUE OVER",
                "he drift compensation value of the Xs-axis(cam-axis)\n" +
                        "       exceeds the allowable limit.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]\n" +
                        "       Hexadecimal of drift compensation value (units:0.2 um)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       D/A gain adjusting error with the PSC board.\n" +
                        "       [Measures to Take]\n" +
                        "       Adjust the D/A gain of the PSC board.");

        ExampleItem PSCB_REAL_TIME_TASK_ERROR = new ExampleItem("1482", "PSCB REAL TIME TASK ERROR",
                "Real time task control is not impossible with the PSC \n" +
                        "       board.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty PSC board.\n" +
                        "       [Measures to Take]\n" +
                        "       Replace the PSC board.");

        ExampleItem PSCB_INT_TASK_LOOP_ERROR = new ExampleItem("1483", "PSCB INT TASK LOOP ERROR",
                "The INT task loop error occured with the PSC board.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]\n" +
                        "       Program counter of the program block involved with the\n" +
                        "       loop error.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty PSC board.\n" +
                        "       [Measures to Take]\n" +
                        "       Replace the PSC board.");

        ExampleItem PSCB_EC_TASK_LOOP_ERROR = new ExampleItem("1484", "PSCB EC TASK LOOP ERROR",
                "Before the currently EC task is completed, the task is\n" +
                        "       going to be started.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty PSC board.\n" +
                        "       [Measures to Take]\n" +
                        "       Replace the PSC board.");

        ExampleItem PSCB_TIME_SHARING_TASK_ERROR = new ExampleItem("1485", "PSCB TIME SHARING TASK ERROR",
                "Time sharing task control is not impossible with the PSC\n" +
                        "       board.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty PSC board.\n" +
                        "       [Measures to Take]\n" +
                        "       Replace the PSC board.");

        ExampleItem 	PSCB_EXCEPTION_ERROR = new ExampleItem("1486", "PSCB EXCEPTION ERROR",
                "Abnormal exception occurred with the PSC board.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty PSC board.\n" +
                        "       [Measures to Take]\n" +
                        "       Replace the PSC board.");

        ExampleItem PSCB_MEMORY_TEST_ERROR = new ExampleItem("1487", "PSCB MEMORY TEST ERROR",
                "The memory of the PSC board does not work normally.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Faulty PSC board.\n" +
                        "       [Measures to Take]\n" +
                        "       Replace the PSC board.");

        ExampleItem PSCB_OVER_HEAT = new ExampleItem("1488", "PSCB OVER HEAT",
                "Overheat of the cam-axis drive motor or the servo \n" +
                        "       amplifier.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Motor ... The thermal protector is tripped due to \n" +
                        "       \t  overcurrent.\n" +
                        "       Servo amplifier ... The heat sink is overheated.\n" +
                        "       [Measures to Take]\n" +
                        "       Turn off the power once and then turn it on after several\n" +
                        "       10min.");

        ExampleItem FIRST_TIME_DRIFT_COMPENSATION_VALUE_OVER = new ExampleItem("1489", "FIRST TIME DRIFT COMPENSATION VALUE OVER",
                "The first drift compensation value of the Xs-axis(cam-axis)\n" +
                        "       exceeded the allowable limit.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]Hexadecimal of drift compensation value(units: 0.2um)\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       D/A gain adjusting error with the PSC board.\n" +
                        "       [Measures to Take]\n" +
                        "       Adjust the D/A gain of the PSC board.");

        ExampleItem SYNCHRONOUS_MODE_SPINDLE_SPEED_COMMAND = new ExampleItem("1490", "SYNCHRONOUS MODE SPINDLE SPEED COMMAND",
                "When the synchronous mode is entered, the spindle speed\n" +
                        "       in the cam execute data and the programmed spindle speed\n" +
                        "       do not agree with each other.\n" +
                        "       [Index]None\n" +
                        "       [Character-string]None\n" +
                        "       [Code]\n" +
                        "       Hexadecimal of the spindle speed in the cam execute data\n" +
                        "       and the programmed spindle speed do not agree with each\n" +
                        "       other.\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       The programmed spindle speed differs from the one used in\n" +
                        "       the learning control.\n" +
                        "       [Measures to Take]\n" +
                        "       Review the spindle speed.\n" +
                        "       Carry out the learning control again.");

        ExampleItem HEAVY_TOOLING_DATA_NOT_FOUND = new ExampleItem("1491", "HEAVY TOOLING DATA NOT FOUND",
                "In the spec of Heavy Tooling, there  are not\n" +
                        "       \"Heavy Tooling DATA\" that selected by the parameter in\n" +
                        "       axis-data-file.\n" +
                        "       [Object]TURRET\n" +
                        "       [Character-string]None\n" +
                        "       [Code]None\n" +
                        "       [Probable Faulty Locations]\n" +
                        "       Axis data file");

        ExampleItem PSCB_PG_UNDER_PULSE = new ExampleItem("1492", "PSCB P.G. UNDER PULSE", " ");

        ExampleItem PSCB_PG_OVER_PULSE = new ExampleItem("1493", "PSCBP.G. OVER PULSE", " ");

        ExampleItem PSCB_MINUS_STROKE_END_OVER = new ExampleItem("1494", "PSCB MINUS STROKE END OVER", " ");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");

        ExampleItem SYSTEM_GENERATE = new ExampleItem("", "", "");



// ------------------------------------------------------------------------------------------------------------------------------//


        list.add(BUS_ERROR);
        list.add(ADDRESS_ERROR);
        list.add(ILLEGAL_INSTRUCTION_ERROR);
        list.add(ZERO_DIVIDE_ERROR);
        list.add(CHK_INSTRUCTION_ERROR);
        list.add(TRAPV_INSTRUCTION_ERROR);
        list.add(PRIVILEGE_VIOLATION_ERROR);
        list.add(TRACE_ERROR);
        list.add(LINE_1010_EMULATOR_ERROR);
        list.add(LINE_1111_EMULATOR_ERROR);
        list.add(EXCEPTION_VECTOR_ERROR);
        list.add(SPURIOUS_INTERRUPT_ERROR);
        list.add(INTERRUPT_ERROR);
        list.add(TRAP_INSTRUCTION_ERROR);
        list.add(USER_INTERRUPT_ERROR);
        list.add(COPROCESSOR_ROTOCOL_ERROR);
        list.add(FORMAT_ERROR);
        list.add(UNINITIALIZED_INTERRUPT_ERROR);
        list.add(FPCP_UNDEFINED_CONDITION_ERROR);
        list.add(FPCP_INEXACT_RESULT_ERROR);
        list.add(FPCP_IVIDE_BY_ZERO_ERROR);
        list.add(FPCP_UNDERFLOW_ERROR);
        list.add(FPCP_OPERAND_ERROR);
        list.add(FPCP_OVERFLOW_ERROR);
        list.add(FPCP_SIGNALING_NAN_ERROR);
        list.add(DEVICE_NAME);
        list.add(SECTOR_DEVICE_NAME);
        list.add(PRINT_DEVICE_NAME);
        list.add(FILE_NAME);
        list.add(COMMAND_CHARACTER);
        list.add(COMMAND_SYNTAX);
        list.add(OPTION);
        list.add(FILE_ATTRIBUTE);
        list.add(DEVICE_FULL);
        list.add(DISK_UNINITIALIZED);
        list.add(ERROR_MAP_INFORMATION);
        list.add(SVCL);
        list.add(MEMORY_DISK_ACCESS_SECTOR_OVER);
        list.add(MEMORY_DISK_ROM_ACCESS);
        list.add(DMA_TRANSFER_SECTOR_OVER);
        list.add(MEMORY_DISK_BATTERY_VOLTAGE_LOW);
        list.add(MEMORY_DISK_FORMAT);
        list.add(FLOPPY_DISK_READ_WRITE);
        list.add(FLOPPY_DISK_ACCESS_SECTOR_OVER);
        list.add(FLOPPY_DISK_WRITE_VERIFY);
        list.add(FLOPPY_DISK_SEEK);
        list.add(FLOPPY_DISK_RECALIBRATE);
        list.add(FLOPPY_DISK_FORMATTING);
        list.add(FLOPPY_DISK_TIME_OUT);
        list.add(FLOPPY_READY);
        list.add(FLOPPY_DISK_WRITE_PROTECT);
        list.add(DMA_TRANSFER);
        list.add(CAP_ACP_READY);
        list.add(MEMORY_WRITE_READ_TEST);
        list.add(PROGRAM_LOAD);
        list.add(NOT_FOUND_PROGRAM_FILE);
        list.add(PROGRAM_LOAD_ADDRESS);
        list.add(PROGRAM_ATTRIBUTE);
        list.add(MEMORY_DISK_ROM_WRITE);
        list.add(ROMCARD_WRITE_PROHIBIT);
        list.add(FLOPPY_RS232C_BLOCK);
        list.add(SECTOR_DEVICE_UNINITIALIZED);

        //-----------------0200_0268------------

        list.add(SYSTEM_FILE_DATA);
        list.add(MAB_FULL);
        list.add(RECORD_BUFFER_OVER_FLOW);
        list.add(LOAD_OBJECT_ADDRESS);
        list.add(LOAD_OBJECT_ATTRIBUTE);
        list.add(LOAD_VERIFY);
        list.add(DATA_BLOCK_SIZE);
        list.add(SELECTED_NUMBER);
        list.add(MEMORY_DISK_RAM_FORMAT);
        list.add(MEMORY_DISK_RAM_WRITE_READ_TEST);
        list.add(FR_PART_FILE_SIZE);
        list.add(FR_PART_FILE_NUMBER);
        list.add(FR_PART_FILE_LOAD_ADDRESS);
        list.add(SIZE_OVER);
        list.add(DATA_WRITE_VERIFY);
        list.add(MEMORY_DISK_ROM_ERASE);
        list.add(FILE_HEADER);
        list.add(INSTALL_MODE_PROGRAM_LOAD);
        list.add(CONTROL_SOFTWARE_ATTRIBUTE);
        list.add(WORK_AREA_SIZE);
        list.add(MEMORY_DISK_BATTERY_VOLTAGE_LOW_0268);

        //--------------0300_0355---------------------

        list.add(DEVICE_NAME_0300);
        list.add(SECTOR_DEVICE_NAME_0301);
        list.add(PRINT_DEVICE_NAME_0302);
        list.add(READER_DEVICE_NAME);
        list.add(PUNCHER_DEVICE_NAME);
        list.add(FILE_NAME_0305);
        list.add(COMMAND_CHARACTER_0306);
        list.add(COMMAND_SYNTAX_0307);
        list.add(OPTION_0308);
        list.add(RS232C_CHANNEL_IN_USE);
        list.add(FILE_ATTRIBUTE_0310);
        list.add(DEVICE_FULL_0311);
        list.add(DISK_UNINITIALIZED_0312);
        list.add(FILE_LABEL_AREA_OVER_FLOW);
        list.add(ERROR_MAP_INFORMATION_0314);
        list.add(VOLUME_LABEL_INFORMATION);
        list.add(FILE_REGIST);
        list.add(MULTI_VOLUME_INFORMATION);
        list.add(SVCL_0318);
        list.add(RS232C_DEVICE_READ);
        list.add(RS232C_TERMINAL_NOT_READY);
        list.add(RS232C_READY_STATUS_TIME_OUT);
        list.add(RS232C_DEVICE_NAME);
        list.add(MEMORY_DISK_ACCESS_SECTOR_OVER_0324);
        list.add(MEMORY_DISK_ROM_ACCESS_SECTOR_OVER);
        list.add(DMA_TRANSFER_SECTOR_OVER_0326);
        list.add(MEMORY_DISK_FORMAT_0328);
        list.add(FLOPPY_DISK_READ_WRITE_0330);
        list.add(FLOPPY_DISK_ACCESS_SECTOR_OVER_0331);
        list.add(FLOPPY_DISK_WRITE_VERIFY_0332);
        list.add(FLOPPY_DISK_SEEK_0333);
        list.add(FLOPPY_DISK_RECALIBRATE_0334);
        list.add(FLOPPY_DISK_FORMATTING_0335);
        list.add(FLOPPY_DISK_TIME_OUT_0336);
        list.add(FLOPPY_READY_0337);
        list.add(FLOPPY_DISK_WRITE_PROTECT_0338);
        list.add(PTR_READ);
        list.add(PTR_ERRATIC_OPERATION_DETECT);
        list.add(PTR_READY_STATUS_TIME_OUT);
        list.add(PTR_READY_INTERRUPT_TIME_OUT);
        list.add(DMA_TRANSFER_0343);
        list.add(PRINTER);
        list.add(PUNCHER);
        list.add(CAP_ACP_READY_0346);
        list.add(MEMORY_WRITE_READ_TEST_0347);
        list.add(PROGRAM_LOAD_0348);
        list.add(NOT_FOUND_PROGRAM_FILE_0349);
        list.add(PROGRAM_LOAD_ADDRESS_0350);
        list.add(PROGRAM_ATTRIBUTE_0351);
        list.add(MEMORY_DISK_ROM_WRIGHT);
        list.add(ROM_CARD_WRIGHT_PROHIBITION);
        list.add(FLOPPY_RS232C_BLOCK_0354);
        list.add(SECTOR_DEVICE_UNINITIALIZED_0355);

        //--------------------------------400_410---------------------

        list.add(NOT_FOUND_UTILITY_COMMAND_FILE);
        list.add(LOAD_OBJECT_ADDRESS_0401);
        list.add(LOAD_OBJECT_ATTRIBUTE_0402);
        list.add(DATA_BLOCK_SIZE_0403);
        list.add(INITIALIZE_DEVICE_NAME);
        list.add(FLOPPY_DISK_INITIALIZE);
        list.add(PATCH_SECTOR_AREA);
        list.add(PATCH_SECTOR_ADDRESS_OVER);
        list.add(CONSOLE_LINE_SETTING);
        list.add(FILE_WRITE_PROTECT);
        list.add(SYSTEM_GENERATE);

        //---------------------------------


        return list;
    }
}

