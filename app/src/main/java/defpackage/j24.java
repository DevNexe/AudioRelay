package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class j24 implements i24 {
    public static final f34 d;
    public final Map<Object, Map<String, List<Object>>> a;
    public final LinkedHashMap b;
    public m24 c;

    public static final class CQf extends cx1 implements j81<Map<Object, Map<String, ? extends List<? extends Object>>>, j24> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final j24 invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            return new j24((Map<Object, Map<String, List<Object>>>) map);
        }
    }

    public final class F1 {
        public final Object a;
        public boolean b = true;
        public final n24 c;

        public static final class QnHx extends cx1 implements j81<Object, Boolean> {
            public final /* synthetic */ j24 w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QnHx(j24 j24Var) {
                super(1);
                this.w = j24Var;
            }

            @Override // defpackage.j81
            public final Boolean invoke(Object obj) {
                m24 m24Var = this.w.c;
                return Boolean.valueOf(m24Var != null ? m24Var.a(obj) : true);
            }
        }

        public F1(j24 j24Var, Object obj) {
            this.a = obj;
            Map<String, List<Object>> map = j24Var.a.get(obj);
            QnHx qnHx = new QnHx(j24Var);
            jt4 jt4Var = o24.a;
            this.c = new n24(map, qnHx);
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ j24 w;
        public final /* synthetic */ Object x;
        public final /* synthetic */ F1 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(F1 f1, j24 j24Var, Object obj) {
            super(1);
            this.w = j24Var;
            this.x = obj;
            this.y = f1;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            j24 j24Var = this.w;
            LinkedHashMap linkedHashMap = j24Var.b;
            Object obj = this.x;
            if (!(!linkedHashMap.containsKey(obj))) {
                throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
            }
            j24Var.a.remove(obj);
            LinkedHashMap linkedHashMap2 = j24Var.b;
            F1 f1 = this.y;
            linkedHashMap2.put(obj, f1);
            return new k24(f1, j24Var, obj);
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ Object x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NUlFixed(Object obj, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.x = obj;
            this.y = x81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            Object obj = this.x;
            x81<g30, Integer, sd5> x81Var = this.y;
            j24.this.b(obj, x81Var, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g34, j24, Map<Object, Map<String, ? extends List<? extends Object>>>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final Map<Object, Map<String, ? extends List<? extends Object>>> invoke(g34 g34Var, j24 j24Var) {
            j24 j24Var2 = j24Var;
            f34 f34Var = j24.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(j24Var2.a);
            for (F1 f1 : j24Var2.b.values()) {
                if (f1.b) {
                    Map<String, List<Object>> mapC = f1.c.c();
                    boolean zIsEmpty = mapC.isEmpty();
                    Object obj = f1.a;
                    if (zIsEmpty) {
                        linkedHashMap.remove(obj);
                    } else {
                        linkedHashMap.put(obj, mapC);
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return null;
            }
            return linkedHashMap;
        }
    }

    static {
        f34 f34Var = e34.a;
        d = new f34(QnHx.w, CQf.w);
    }

    public j24() {
        this(0);
    }

    public j24(Map<Object, Map<String, List<Object>>> map) {
        this.a = map;
        this.b = new LinkedHashMap();
    }

    @Override // defpackage.i24
    public final void a(UUID uuid) {
        F1 f1 = (F1) this.b.get(uuid);
        if (f1 != null) {
            f1.b = false;
        } else {
            this.a.remove(uuid);
        }
    }

    @Override // defpackage.i24
    public final void b(Object obj, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-1198538093);
        j30VarQ.e(444418301);
        j30VarQ.o(obj);
        j30VarQ.e(-642722479);
        j30VarQ.e(-492369756);
        Object objB0 = j30VarQ.b0();
        if (objB0 == g30.QnHx.a) {
            m24 m24Var = this.c;
            if (!(m24Var != null ? m24Var.a(obj) : true)) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            objB0 = new F1(this, obj);
            j30VarQ.F0(objB0);
        }
        j30VarQ.R(false);
        F1 f1 = (F1) objB0;
        q40.a(new ng3[]{o24.a.b(f1.c)}, x81Var, j30VarQ, (i & 112) | 8);
        wq0.a(sd5.a, new LPt8Fixed(f1, this, obj), j30VarQ);
        j30VarQ.R(false);
        j30VarQ.d();
        j30VarQ.R(false);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(obj, x81Var, i);
    }

    public /* synthetic */ j24(int i) {
        this(new LinkedHashMap());
    }
}
