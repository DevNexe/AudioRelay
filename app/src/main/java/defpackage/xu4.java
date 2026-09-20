package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface xu4 {

    public static final class QnHx {
        public static void a(xu4 xu4Var, x81<? super String, ? super List<String>, sd5> x81Var) {
            Iterator<T> it = xu4Var.a().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                x81Var.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }
    }

    Set<Map.Entry<String, List<String>>> a();

    void b(x81<? super String, ? super List<String>, sd5> x81Var);

    boolean c();

    String get(String str);

    boolean isEmpty();
}
