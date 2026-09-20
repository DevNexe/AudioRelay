package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n52 {
    public LinkedHashMap a;
    public LinkedHashMap b;
    public LinkedHashMap c;

    public final void a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.b = linkedHashMap;
        }
        linkedHashMap.put("enabled", boolValueOf);
    }

    public final void b(String str, String str2) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.a = linkedHashMap;
        }
        linkedHashMap.put(str, str2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap != null) {
            sb.append(linkedHashMap);
            sb.append('\n');
        }
        LinkedHashMap linkedHashMap2 = this.b;
        if (linkedHashMap2 != null) {
            sb.append(linkedHashMap2);
            sb.append('\n');
        }
        LinkedHashMap linkedHashMap3 = this.c;
        if (linkedHashMap3 != null) {
            sb.append(linkedHashMap3);
            sb.append('\n');
        }
        return sb.toString();
    }
}
