package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n24 implements m24 {
    public final j81<Object, Boolean> a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;

    public static final class QnHx implements m24.QnHx {
        public final /* synthetic */ String b;
        public final /* synthetic */ h81<Object> c;

        public QnHx(String str, h81<? extends Object> h81Var) {
            this.b = str;
            this.c = h81Var;
        }

        @Override // m24.QnHx
        public final void a() {
            n24 n24Var = n24.this;
            LinkedHashMap linkedHashMap = n24Var.c;
            String str = this.b;
            List list = (List) linkedHashMap.remove(str);
            if (list != null) {
                list.remove(this.c);
            }
            if (list == null || !(!list.isEmpty())) {
                return;
            }
            n24Var.c.put(str, list);
        }
    }

    public n24(Map<String, ? extends List<? extends Object>> map, j81<Object, Boolean> j81Var) {
        this.a = j81Var;
        this.b = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
        this.c = new LinkedHashMap();
    }

    @Override // defpackage.m24
    public final boolean a(Object obj) {
        return this.a.invoke(obj).booleanValue();
    }

    @Override // defpackage.m24
    public final m24.QnHx b(String str, h81<? extends Object> h81Var) {
        if (!(!iv4.s(str))) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        LinkedHashMap linkedHashMap = this.c;
        Object arrayList = linkedHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(str, arrayList);
        }
        ((List) arrayList).add(h81Var);
        return new QnHx(str, h81Var);
    }

    @Override // defpackage.m24
    public final Map<String, List<Object>> c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.b);
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((h81) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    linkedHashMap.put(str, ps0.j(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object objInvoke2 = ((h81) list.get(i)).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(objInvoke2);
                }
                linkedHashMap.put(str, arrayList);
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.m24
    public final Object d(String str) {
        LinkedHashMap linkedHashMap = this.b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }
}
