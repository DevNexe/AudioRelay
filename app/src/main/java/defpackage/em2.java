package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class em2 extends qi2 {
    public final qi2 l;
    public boolean m;

    public em2(int i, gp4 gp4Var, j81<Object, sd5> j81Var, j81<Object, sd5> j81Var2, qi2 qi2Var) {
        super(i, gp4Var, j81Var, j81Var2);
        this.l = qi2Var;
        qi2Var.j();
    }

    @Override // defpackage.qi2, defpackage.cp4
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.m) {
            return;
        }
        this.m = true;
        this.l.k();
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
    @Override // defpackage.qi2
    public final ep4 t() {
        Set set;
        qi2 qi2Var = this.l;
        if (qi2Var.k || qi2Var.c) {
            return new ep4.QnHx();
        }
        Set<ws4> set2 = this.g;
        int i = this.b;
        HashMap mapC = set2 != null ? ip4.c(qi2Var, this, qi2Var.e()) : null;
        Object obj = ip4.c;
        synchronized (obj) {
            ip4.d(this);
            if (set2 == null || set2.size() == 0) {
                a();
            } else {
                ep4 ep4VarV = v(this.l.d(), mapC, this.l.e());
                if (!ur1.a(ep4VarV, ep4.CQf.a)) {
                    return ep4VarV;
                }
                Set<ws4> setU = this.l.u();
                if (setU == null) {
                    set = setU;
                    HashSet hashSet = new HashSet();
                    this.l.x(hashSet);
                    set = hashSet;
                }
                set = setU;
                set.addAll(set2);
            }
            if (this.l.d() < i) {
                this.l.s();
            }
            qi2 qi2Var2 = this.l;
            qi2Var2.q(qi2Var2.e().b(i).a(this.h));
            this.l.w(i);
            qi2 qi2Var3 = this.l;
            int i2 = this.d;
            this.d = -1;
            if (i2 >= 0) {
                int[] iArr = qi2Var3.i;
                int length = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = i2;
                qi2Var3.i = iArrCopyOf;
            } else {
                qi2Var3.getClass();
            }
            qi2 qi2Var4 = this.l;
            gp4 gp4Var = this.h;
            qi2Var4.getClass();
            synchronized (obj) {
                qi2Var4.h = qi2Var4.h.e(gp4Var);
                sd5 sd5Var = sd5.a;
                qi2 qi2Var5 = this.l;
                int[] iArr2 = this.i;
                qi2Var5.getClass();
                if (!(iArr2.length == 0)) {
                    int[] iArr3 = qi2Var5.i;
                    if (iArr3.length == 0) {
                        qi2Var5.i = iArr2;
                    } else {
                        int length2 = iArr3.length;
                        int length3 = iArr2.length;
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                        System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                        qi2Var5.i = iArrCopyOf2;
                    }
                }
            }
            this.k = true;
            if (!this.m) {
                this.m = true;
                this.l.k();
            }
            return ep4.CQf.a;
        }
    }
}
