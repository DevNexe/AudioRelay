package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l43 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ long A;
    public final /* synthetic */ dj4 B;
    public final /* synthetic */ y81<t95.CQf<Boolean>, g30, Integer, lx0<Float>> w;
    public final /* synthetic */ y81<t95.CQf<Boolean>, g30, Integer, lx0<Float>> x;
    public final /* synthetic */ g43 y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l43(long j, dj4 dj4Var, g43 g43Var, y81 y81Var, y81 y81Var2, boolean z) {
        super(3);
        this.w = y81Var;
        this.x = y81Var2;
        this.y = g43Var;
        this.z = z;
        this.A = j;
        this.B = dj4Var;
    }

    public static final float a(is4<Float> is4Var) {
        return is4Var.getValue().floatValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v66 t95$CQf<java.lang.Boolean>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // defpackage.y81
    public final defpackage.pg2 invoke(defpackage.pg2 r25, defpackage.g30 r26, java.lang.Integer r27) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l43.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
