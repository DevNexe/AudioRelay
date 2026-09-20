package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class av4 implements yu4 {
    public final boolean a = true;
    public final Map<String, List<String>> b = new qn();

    public av4(int i) {
    }

    @Override // defpackage.yu4
    public final Set<Map.Entry<String, List<String>>> a() {
        return Collections.unmodifiableSet(this.b.entrySet());
    }

    @Override // defpackage.yu4
    public final void b(String str, String str2) {
        i(str2);
        List<String> listF = f(str);
        listF.clear();
        listF.add(str2);
    }

    @Override // defpackage.yu4
    public final void c(String str, Iterable<String> iterable) {
        List<String> listF = f(str);
        for (String str2 : iterable) {
            i(str2);
            listF.add(str2);
        }
    }

    @Override // defpackage.yu4
    public final void clear() {
        this.b.clear();
    }

    @Override // defpackage.yu4
    public final List<String> d(String str) {
        return this.b.get(str);
    }

    public final void e(String str, String str2) {
        i(str2);
        f(str).add(str2);
    }

    public final List<String> f(String str) {
        Map<String, List<String>> map = this.b;
        List<String> list = map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        h(str);
        map.put(str, arrayList);
        return arrayList;
    }

    public final String g(String str) {
        List<String> listD = d(str);
        if (listD != null) {
            return (String) wu.J0(listD);
        }
        return null;
    }

    public void h(String str) {
    }

    public void i(String str) {
    }

    @Override // defpackage.yu4
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // defpackage.yu4
    public final Set<String> names() {
        return this.b.keySet();
    }
}
