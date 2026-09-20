package defpackage;

import com.google.android.gms.internal.measurement.QX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wx6 {
    public static ez5 a(QX qx) {
        if (qx == null) {
            return ez5.o;
        }
        int iA = qx.A() - 1;
        if (iA == 1) {
            return qx.z() ? new f06(qx.u()) : ez5.v;
        }
        if (iA == 2) {
            return qx.y() ? new gw5(Double.valueOf(qx.r())) : new gw5(null);
        }
        if (iA == 3) {
            return qx.x() ? new av5(Boolean.valueOf(qx.w())) : new av5(null);
        }
        if (iA != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        d27 d27VarV = qx.v();
        ArrayList arrayList = new ArrayList();
        Iterator it = d27VarV.iterator();
        while (it.hasNext()) {
            arrayList.add(a((QX) it.next()));
        }
        return new mz5(qx.t(), arrayList);
    }

    public static ez5 b(Object obj) {
        if (obj == null) {
            return ez5.p;
        }
        if (obj instanceof String) {
            return new f06((String) obj);
        }
        if (obj instanceof Double) {
            return new gw5((Double) obj);
        }
        if (obj instanceof Long) {
            return new gw5(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new gw5(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new av5((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            hu5 hu5Var = new hu5();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                hu5Var.p(hu5Var.d(), b(it.next()));
            }
            return hu5Var;
        }
        hy5 hy5Var = new hy5();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            ez5 ez5VarB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                hy5Var.b((String) string, ez5VarB);
            }
        }
        return hy5Var;
    }
}
