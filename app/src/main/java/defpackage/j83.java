package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class j83 implements h83 {
    public final Rm a;
    public final gq4 b;

    public static final class QnHx extends cx1 implements h81<Boolean> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final Boolean invoke() {
            j81 j81Var = eu.y;
            return Boolean.valueOf(Boolean.parseBoolean(j81Var != null ? (String) j81Var.invoke("ENABLE_LOG_SCORE") : null));
        }
    }

    public j83(Rm rm, gq4 gq4Var) {
        this.a = rm;
        this.b = gq4Var;
        new ry4(QnHx.w);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [i83] */
    @Override // defpackage.h83
    public final vq2<g83> a(final b73 b73Var) {
        g83 g83Var = new g83(0);
        return new rs2(new ps2(new cs2(vq2.r(1L, 1L, TimeUnit.SECONDS, j54.b), new D(this, 13)), new m91.PRnFixed(g83Var), new ba(this) { // from class: i83
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ba
            public final Object apply(Object obj, Object obj2) {
                List listE1;
                g83 g83Var2 = (g83) obj;
                uy2 uy2Var = (uy2) obj2;
                d73.CQf cQf = (d73.CQf) uy2Var.w;
                d73.QnHx qnHx = (d73.QnHx) uy2Var.x;
                b73 b73Var2 = this.w;
                b73Var2.getClass();
                long jC = zs.QnHx.a.c() - b73Var2.a;
                long j = g83Var2.d + ((long) cQf.a);
                long j2 = qnHx.a;
                long j3 = qnHx.c;
                List<dp4> list = g83Var2.e;
                int size = list.size();
                if (29 >= size) {
                    listE1 = wu.e1(list);
                } else {
                    ArrayList arrayList = new ArrayList(29);
                    if (list instanceof RandomAccess) {
                        for (int i = size - 29; i < size; i++) {
                            arrayList.add(list.get(i));
                        }
                    } else {
                        ListIterator<dp4> listIterator = list.listIterator(size - 29);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    listE1 = arrayList;
                }
                return new g83(jC, j2, j3, j, wu.V0(new dp4(qnHx.f, cQf.b, cQf.d, cQf.c, cQf.e, qnHx.g), listE1));
            }
        }));
    }
}
