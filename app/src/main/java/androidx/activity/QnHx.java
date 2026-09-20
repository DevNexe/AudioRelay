package androidx.activity;

import defpackage.FLr;
import defpackage.PE_;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ FLr.QnHx x;
    public final /* synthetic */ ComponentActivity.CQf y;

    public QnHx(ComponentActivity.CQf cQf, int i, FLr.QnHx qnHx) {
        this.y = cQf;
        this.w = i;
        this.x = qnHx;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // java.lang.Runnable
    public final void run() {
        PE_<O> pe_;
        T t = this.x.a;
        ComponentActivity.CQf cQf = this.y;
        String str = (String) cQf.b.get(Integer.valueOf(this.w));
        if (str == null) {
            return;
        }
        androidx.activity.result.QnHx.C0016QnHx c0016QnHx = (androidx.activity.result.QnHx.C0016QnHx) cQf.f.get(str);
        if (c0016QnHx == null || (pe_ = c0016QnHx.a) == 0) {
            cQf.h.remove(str);
            cQf.g.put(str, t);
        } else if (cQf.e.remove(str)) {
            pe_.b(t);
        }
    }
}
