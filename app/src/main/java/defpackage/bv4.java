package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class bv4 implements xu4 {
    public final boolean c = true;
    public final Map<String, List<String>> d;

    public bv4(Map map) {
        qn qnVar = new qn();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            qnVar.put(str, arrayList);
        }
        this.d = qnVar;
    }

    @Override // defpackage.xu4
    public final Set<Map.Entry<String, List<String>>> a() {
        return Collections.unmodifiableSet(this.d.entrySet());
    }

    @Override // defpackage.xu4
    public final void b(x81<? super String, ? super List<String>, sd5> x81Var) {
        for (Map.Entry<String, List<String>> entry : this.d.entrySet()) {
            x81Var.invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.xu4
    public final boolean c() {
        return this.c;
    }

    public final Set<String> d() {
        return Collections.unmodifiableSet(this.d.keySet());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu4)) {
            return false;
        }
        xu4 xu4Var = (xu4) obj;
        if (this.c != xu4Var.c()) {
            return false;
        }
        return ur1.a(a(), xu4Var.a());
    }

    @Override // defpackage.xu4
    public final String get(String str) {
        List<String> list = this.d.get(str);
        if (list != null) {
            return (String) wu.J0(list);
        }
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + ((this.c ? 1231 : 1237) * 31 * 31);
    }

    @Override // defpackage.xu4
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }
}
