package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class t57 {
    public static final /* synthetic */ t57[] x;
    public final u57 w;

    /* JADX INFO: Fake field, exist only in values array */
    t57 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    t57 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    t57 EF2;

    static {
        t57 t57Var = new t57("DOUBLE", 0, u57.A);
        t57 t57Var2 = new t57("FLOAT", 1, u57.z);
        u57 u57Var = u57.y;
        t57 t57Var3 = new t57("INT64", 2, u57Var);
        t57 t57Var4 = new t57("UINT64", 3, u57Var);
        u57 u57Var2 = u57.x;
        t57 t57Var5 = new t57("INT32", 4, u57Var2);
        t57 t57Var6 = new t57("FIXED64", 5, u57Var);
        t57 t57Var7 = new t57("FIXED32", 6, u57Var2);
        t57 t57Var8 = new t57("BOOL", 7, u57.B);
        t57 t57Var9 = new t57("STRING", 8, u57.C);
        u57 u57Var3 = u57.F;
        x = new t57[]{t57Var, t57Var2, t57Var3, t57Var4, t57Var5, t57Var6, t57Var7, t57Var8, t57Var9, new t57("GROUP", 9, u57Var3), new t57("MESSAGE", 10, u57Var3), new t57("BYTES", 11, u57.D), new t57("UINT32", 12, u57Var2), new t57("ENUM", 13, u57.E), new t57("SFIXED32", 14, u57Var2), new t57("SFIXED64", 15, u57Var), new t57("SINT32", 16, u57Var2), new t57("SINT64", 17, u57Var)};
    }

    public t57(String str, int i, u57 u57Var) {
        super(str, i);
        this.w = u57Var;
    }

    public static t57[] values() {
        return (t57[]) x.clone();
    }
}
