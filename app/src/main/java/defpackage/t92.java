package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class t92 extends C0239D {
    public static final Object P(Object obj, Map map) {
        if (map instanceof r92) {
            return ((r92) map).d();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static final Map Q(uy2... uy2VarArr) {
        if (uy2VarArr.length <= 0) {
            return ds0.w;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0239D.A(uy2VarArr.length));
        T(linkedHashMap, uy2VarArr);
        return linkedHashMap;
    }

    public static final Map R(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            return ds0.w;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final LinkedHashMap S(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void T(AbstractMap abstractMap, uy2[] uy2VarArr) {
        for (uy2 uy2Var : uy2VarArr) {
            abstractMap.put(uy2Var.w, uy2Var.x);
        }
    }

    public static final void U(ArrayList arrayList, HashMap map) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uy2 uy2Var = (uy2) it.next();
            map.put(uy2Var.w, uy2Var.x);
        }
    }

    public static final Map V(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return ds0.w;
        }
        if (size == 1) {
            uy2 uy2Var = (uy2) arrayList.get(0);
            return Collections.singletonMap(uy2Var.w, uy2Var.x);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0239D.A(arrayList.size()));
        U(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static final Map W(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            return ds0.w;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
