package defpackage;

import androidx.lifecycle.YKK;
import androidx.lifecycle.auxFixed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ok0 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ kk2 w;
        public final /* synthetic */ i24 x;
        public final /* synthetic */ vk0 y;
        public final /* synthetic */ vk0.QnHx z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(kk2 kk2Var, j24 j24Var, vk0 vk0Var, vk0.QnHx qnHx) {
            super(2);
            this.w = kk2Var;
            this.x = j24Var;
            this.y = vk0Var;
            this.z = qnHx;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                vk0 vk0Var = this.y;
                kk2 kk2Var = this.w;
                wq0.a(kk2Var, new qk0(vk0Var, kk2Var), g30Var2);
                lk2.a(kk2Var, this.x, X.m(g30Var2, -497631156, new rk0(this.z, kk2Var)), g30Var2, 456);
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ vk0 w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(vk0 vk0Var, int i) {
            super(2);
            this.w = vk0Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            ok0.a(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ kk2 w;
        public final /* synthetic */ List<kk2> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(kk2 kk2Var, List<kk2> list) {
            super(1);
            this.w = kk2Var;
            this.x = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [c32, sk0] */
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
        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            final kk2 kk2Var = this.w;
            final List<kk2> list = this.x;
            ?? r3 = new auxFixed() { // from class: sk0
                @Override // androidx.lifecycle.auxFixed
                public final void h(d32 d32Var, YKK.CQf cQf) {
                    YKK.CQf cQf2 = YKK.CQf.ON_START;
                    List list2 = list;
                    kk2 kk2Var2 = kk2Var;
                    if (cQf == cQf2 && !list2.contains(kk2Var2)) {
                        list2.add(kk2Var2);
                    }
                    if (cQf == YKK.CQf.ON_STOP) {
                        list2.remove(kk2Var2);
                    }
                }
            };
            kk2Var.D.a(r3);
            return new tk0(kk2Var, r3);
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ List<kk2> w;
        public final /* synthetic */ Collection<kk2> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(List<kk2> list, Collection<kk2> collection, int i) {
            super(2);
            this.w = list;
            this.x = collection;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            ok0.b(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ vk0 w;
        public final /* synthetic */ kk2 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(vk0 vk0Var, kk2 kk2Var) {
            super(0);
            this.w = vk0Var;
            this.x = kk2Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.b().d(this.x, false);
            return sd5.a;
        }
    }

    public static final void a(vk0 vk0Var, g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(294589392);
        if ((((i & 14) == 0 ? (j30VarQ.I(vk0Var) ? 4 : 2) | i : i) & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            j24 j24VarK = S12N.k(j30VarQ);
            ri2 ri2VarT = ps0.t(vk0Var.b().e, j30VarQ);
            List list = (List) ri2VarT.getValue();
            j30VarQ.e(467378629);
            j30VarQ.e(-3686930);
            boolean zI = j30VarQ.I(list);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                obj = objB0;
                wp4 wp4Var = new wp4();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((kk2) obj2).D.c.a(YKK.F1.STARTED)) {
                        arrayList.add(obj2);
                    }
                }
                wp4Var.addAll(arrayList);
                j30VarQ.F0(wp4Var);
                obj = wp4Var;
            }
            obj = objB0;
            j30VarQ.R(false);
            wp4 wp4Var2 = (wp4) obj;
            j30VarQ.R(false);
            b(wp4Var2, (List) ri2VarT.getValue(), j30VarQ, 64);
            ListIterator listIterator = wp4Var2.listIterator();
            while (true) {
                ps4 ps4Var = (ps4) listIterator;
                if (!ps4Var.hasNext()) {
                    break;
                }
                kk2 kk2Var = (kk2) ps4Var.next();
                vk0.QnHx qnHx = (vk0.QnHx) kk2Var.x;
                vQgK.a(new QnHx(vk0Var, kk2Var), qnHx.F, X.m(j30VarQ, 1129586364, new CQf(kk2Var, j24VarK, vk0Var, qnHx)), j30VarQ, 384, 0);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(vk0Var, i);
    }

    public static final void b(List<kk2> list, Collection<kk2> collection, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1537894851);
        for (kk2 kk2Var : collection) {
            wq0.a(kk2Var.D, new LPt8Fixed(kk2Var, list), j30VarQ);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(list, collection, i);
    }
}
