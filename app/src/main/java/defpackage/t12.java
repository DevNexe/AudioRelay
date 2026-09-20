package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class t12 {
    private final ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();

    public final <T> T a(String str, h81<? extends T> h81Var) {
        Object obj = this.map.get(str);
        T t = null;
        if (obj != null) {
            if (obj == u12.a) {
                obj = null;
            }
            return (T) obj;
        }
        synchronized (this.map) {
            Object obj2 = this.map.get(str);
            if (obj2 == null) {
                Object objInvoke = h81Var.invoke();
                if (objInvoke == null) {
                    objInvoke = u12.a;
                }
                obj2 = objInvoke;
                this.map.put(str, obj2);
            }
            if (obj2 != u12.a) {
                t = (T) obj2;
            }
        }
        return t;
    }
}
