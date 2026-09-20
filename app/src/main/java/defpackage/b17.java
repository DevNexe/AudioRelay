package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class b17 {
    public static final /* synthetic */ b17[] A;
    public static final b17 x;
    public static final b17 y;
    public static final b17[] z;
    public final int w;

    /* JADX INFO: Fake field, exist only in values array */
    b17 EF6;

    static {
        i27 i27Var = i27.DOUBLE;
        b17 b17Var = new b17("DOUBLE", 0, 0, 1, i27Var);
        i27 i27Var2 = i27.FLOAT;
        b17 b17Var2 = new b17("FLOAT", 1, 1, 1, i27Var2);
        i27 i27Var3 = i27.LONG;
        b17 b17Var3 = new b17("INT64", 2, 2, 1, i27Var3);
        b17 b17Var4 = new b17("UINT64", 3, 3, 1, i27Var3);
        i27 i27Var4 = i27.INT;
        b17 b17Var5 = new b17("INT32", 4, 4, 1, i27Var4);
        b17 b17Var6 = new b17("FIXED64", 5, 5, 1, i27Var3);
        b17 b17Var7 = new b17("FIXED32", 6, 6, 1, i27Var4);
        i27 i27Var5 = i27.BOOLEAN;
        b17 b17Var8 = new b17("BOOL", 7, 7, 1, i27Var5);
        i27 i27Var6 = i27.STRING;
        b17 b17Var9 = new b17("STRING", 8, 8, 1, i27Var6);
        i27 i27Var7 = i27.MESSAGE;
        b17 b17Var10 = new b17("MESSAGE", 9, 9, 1, i27Var7);
        i27 i27Var8 = i27.BYTE_STRING;
        b17 b17Var11 = new b17("BYTES", 10, 10, 1, i27Var8);
        b17 b17Var12 = new b17("UINT32", 11, 11, 1, i27Var4);
        i27 i27Var9 = i27.ENUM;
        b17 b17Var13 = new b17("ENUM", 12, 12, 1, i27Var9);
        b17 b17Var14 = new b17("SFIXED32", 13, 13, 1, i27Var4);
        b17 b17Var15 = new b17("SFIXED64", 14, 14, 1, i27Var3);
        b17 b17Var16 = new b17("SINT32", 15, 15, 1, i27Var4);
        b17 b17Var17 = new b17("SINT64", 16, 16, 1, i27Var3);
        b17 b17Var18 = new b17("GROUP", 17, 17, 1, i27Var7);
        b17 b17Var19 = new b17("DOUBLE_LIST", 18, 18, 2, i27Var);
        b17 b17Var20 = new b17("FLOAT_LIST", 19, 19, 2, i27Var2);
        b17 b17Var21 = new b17("INT64_LIST", 20, 20, 2, i27Var3);
        b17 b17Var22 = new b17("UINT64_LIST", 21, 21, 2, i27Var3);
        b17 b17Var23 = new b17("INT32_LIST", 22, 22, 2, i27Var4);
        b17 b17Var24 = new b17("FIXED64_LIST", 23, 23, 2, i27Var3);
        b17 b17Var25 = new b17("FIXED32_LIST", 24, 24, 2, i27Var4);
        b17 b17Var26 = new b17("BOOL_LIST", 25, 25, 2, i27Var5);
        b17 b17Var27 = new b17("STRING_LIST", 26, 26, 2, i27Var6);
        b17 b17Var28 = new b17("MESSAGE_LIST", 27, 27, 2, i27Var7);
        b17 b17Var29 = new b17("BYTES_LIST", 28, 28, 2, i27Var8);
        b17 b17Var30 = new b17("UINT32_LIST", 29, 29, 2, i27Var4);
        b17 b17Var31 = new b17("ENUM_LIST", 30, 30, 2, i27Var9);
        b17 b17Var32 = new b17("SFIXED32_LIST", 31, 31, 2, i27Var4);
        b17 b17Var33 = new b17("SFIXED64_LIST", 32, 32, 2, i27Var3);
        b17 b17Var34 = new b17("SINT32_LIST", 33, 33, 2, i27Var4);
        b17 b17Var35 = new b17("SINT64_LIST", 34, 34, 2, i27Var3);
        b17 b17Var36 = new b17("DOUBLE_LIST_PACKED", 35, 35, 3, i27Var);
        x = b17Var36;
        b17 b17Var37 = new b17("FLOAT_LIST_PACKED", 36, 36, 3, i27Var2);
        b17 b17Var38 = new b17("INT64_LIST_PACKED", 37, 37, 3, i27Var3);
        b17 b17Var39 = new b17("UINT64_LIST_PACKED", 38, 38, 3, i27Var3);
        b17 b17Var40 = new b17("INT32_LIST_PACKED", 39, 39, 3, i27Var4);
        b17 b17Var41 = new b17("FIXED64_LIST_PACKED", 40, 40, 3, i27Var3);
        b17 b17Var42 = new b17("FIXED32_LIST_PACKED", 41, 41, 3, i27Var4);
        b17 b17Var43 = new b17("BOOL_LIST_PACKED", 42, 42, 3, i27Var5);
        b17 b17Var44 = new b17("UINT32_LIST_PACKED", 43, 43, 3, i27Var4);
        b17 b17Var45 = new b17("ENUM_LIST_PACKED", 44, 44, 3, i27Var9);
        b17 b17Var46 = new b17("SFIXED32_LIST_PACKED", 45, 45, 3, i27Var4);
        b17 b17Var47 = new b17("SFIXED64_LIST_PACKED", 46, 46, 3, i27Var3);
        b17 b17Var48 = new b17("SINT32_LIST_PACKED", 47, 47, 3, i27Var4);
        b17 b17Var49 = new b17("SINT64_LIST_PACKED", 48, 48, 3, i27Var3);
        y = b17Var49;
        A = new b17[]{b17Var, b17Var2, b17Var3, b17Var4, b17Var5, b17Var6, b17Var7, b17Var8, b17Var9, b17Var10, b17Var11, b17Var12, b17Var13, b17Var14, b17Var15, b17Var16, b17Var17, b17Var18, b17Var19, b17Var20, b17Var21, b17Var22, b17Var23, b17Var24, b17Var25, b17Var26, b17Var27, b17Var28, b17Var29, b17Var30, b17Var31, b17Var32, b17Var33, b17Var34, b17Var35, b17Var36, b17Var37, b17Var38, b17Var39, b17Var40, b17Var41, b17Var42, b17Var43, b17Var44, b17Var45, b17Var46, b17Var47, b17Var48, b17Var49, new b17("GROUP_LIST", 49, 49, 2, i27Var7), new b17("MAP", 50, 50, 4, i27.VOID)};
        b17[] b17VarArrValues = values();
        z = new b17[b17VarArrValues.length];
        for (b17 b17Var50 : b17VarArrValues) {
            z[b17Var50.w] = b17Var50;
        }
    }

    public b17(String str, int i, int i2, int i3, i27 i27Var) {
        super(str, i);
        this.w = i2;
        i27 i27Var2 = i27.VOID;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            i27Var.getClass();
        }
        if (i3 == 1) {
            i27Var.ordinal();
        }
    }

    public static b17[] values() {
        return (b17[]) A.clone();
    }

    public final int zza() {
        return this.w;
    }
}
