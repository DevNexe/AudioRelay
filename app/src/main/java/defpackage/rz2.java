package defpackage;

import android.graphics.PathMeasure;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rz2 extends cg5 {
    public cg b;
    public float c = 1.0f;
    public List<? extends uz2> d;
    public float e;
    public float f;
    public cg g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public qv4 q;
    public final TQ2_ r;
    public final TQ2_ s;
    public final oz1 t;
    public final vz2 u;

    public static final class QnHx extends cx1 implements h81<tz2> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final tz2 invoke() {
            return new tmHX(new PathMeasure());
        }
    }

    public rz2() {
        int i = sg5.a;
        this.d = cs0.w;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        this.p = true;
        this.r = hH.g();
        this.s = hH.g();
        this.t = qLd.h(3, QnHx.w);
        this.u = new vz2();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ??, still in use, count: 1, list:
          (r1v1 ?? I:qv4) from 0x005b: IPUT (r1v1 ?? I:qv4), (r14v0 'this' ?? I:rz2 A[IMMUTABLE_TYPE, THIS]) (LINE:92) rz2.q qv4
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // defpackage.cg5
    public final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ??, still in use, count: 1, list:
          (r1v1 ?? I:qv4) from 0x005b: IPUT (r1v1 ?? I:qv4), (r14v0 'this' ?? I:rz2 A[IMMUTABLE_TYPE, THIS]) (LINE:92) rz2.q qv4
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public final void e() {
        TQ2_ tq2_ = this.s;
        tq2_.reset();
        boolean z = this.k == 0.0f;
        TQ2_ tq2_2 = this.r;
        if (z) {
            if (this.l == 1.0f) {
                tq2_.l(tq2_2, kt2.b);
                return;
            }
        }
        oz1 oz1Var = this.t;
        ((tz2) oz1Var.getValue()).c(tq2_2);
        float fB = ((tz2) oz1Var.getValue()).b();
        float f = this.k;
        float f2 = this.m;
        float f3 = ((f + f2) % 1.0f) * fB;
        float f4 = ((this.l + f2) % 1.0f) * fB;
        if (f3 <= f4) {
            ((tz2) oz1Var.getValue()).a(f3, f4, tq2_);
        } else {
            ((tz2) oz1Var.getValue()).a(f3, fB, tq2_);
            ((tz2) oz1Var.getValue()).a(0.0f, f4, tq2_);
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}
