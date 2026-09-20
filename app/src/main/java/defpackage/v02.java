package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v02 extends cx1 implements y81<Integer, Integer, j81<? super b43.QnHx, ? extends sd5>, sb2> {
    public final /* synthetic */ c02 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v02(c02 c02Var, long j, int i, int i2) {
        super(3);
        this.w = c02Var;
        this.x = j;
        this.y = i;
        this.z = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.y81
    public final sb2 invoke(Integer num, Integer num2, j81<? super b43.QnHx, ? extends sd5> j81Var) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int i = iIntValue + this.y;
        long j = this.x;
        int iW = FWT.w(i, j);
        int iV = FWT.v(iIntValue2 + this.z, j);
        ds0 ds0Var = ds0.w;
        return this.w.K(iW, iV, ds0Var, j81Var);
    }
}
