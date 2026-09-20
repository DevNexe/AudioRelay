package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tq2 {

    public static final class QnHx {
        public final ArrayList a;
        public final Object b;

        public /* synthetic */ QnHx(Object obj) {
            oa3.h(obj);
            this.b = obj;
            this.a = new ArrayList();
        }

        public final void a(Object obj, String str) {
            this.a.add(str + "=" + String.valueOf(obj));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) arrayList.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
