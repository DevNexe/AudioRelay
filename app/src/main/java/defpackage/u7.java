package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface u7<Inputs, Events, State> {

    public static final class QnHx {
        public String a;
        public Object b;
        public eo1<?, ?, ?> c;
        public final List<j7<?, ?, ?>> d;
        public po1<?, ?, ?> e;
        public final oa0 f;
        public final oa0 g;
        public final oa0 h;
        public final oa0 i;
        public final j81<? super String, ? extends m7> j;

        public QnHx() {
            this(null);
        }

        public QnHx(Object obj) {
            ArrayList arrayList = new ArrayList();
            i32 i32Var = new i32();
            qh0 qh0Var = rl0.a;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = arrayList;
            this.e = i32Var;
            this.f = qh0Var;
            this.g = qh0Var;
            this.h = qh0Var;
            this.i = qh0Var;
            this.j = t7.w;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            if (!ur1.a(this.a, qnHx.a) || !ur1.a(this.b, qnHx.b) || !ur1.a(this.c, qnHx.c)) {
                return false;
            }
            qnHx.getClass();
            return ur1.a(null, null) && ur1.a(this.d, qnHx.d) && ur1.a(this.e, qnHx.e) && ur1.a(this.f, qnHx.f) && ur1.a(this.g, qnHx.g) && ur1.a(this.h, qnHx.h) && ur1.a(this.i, qnHx.i) && ur1.a(this.j, qnHx.j);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Object obj = this.b;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            eo1<?, ?, ?> eo1Var = this.c;
            return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + qg5.a(this.d, (((iHashCode2 + (eo1Var == null ? 0 : eo1Var.hashCode())) * 31) + 0) * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Builder(name=" + this.a + ", initialState=" + this.b + ", inputHandler=" + this.c + ", filter=" + ((Object) null) + ", interceptors=" + this.d + ", inputStrategy=" + this.e + ", inputsDispatcher=" + this.f + ", eventsDispatcher=" + this.g + ", sideJobsDispatcher=" + this.h + ", interceptorDispatcher=" + this.i + ", logger=" + this.j + ')';
        }
    }

    State a();

    m7 b();

    oa0 c();

    List<j7<Inputs, Events, State>> d();

    oa0 e();

    oa0 f();

    oa0 g();

    do1<Inputs, Events, State> getFilter();

    String getName();

    po1<Inputs, Events, State> h();

    eo1<Inputs, Events, State> i();
}
