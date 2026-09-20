package defpackage;

import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzze;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vs5 extends ws5 {
    public long x;
    public long[] y;
    public long[] z;

    public vs5() {
        super(new zzze());
        this.x = -9223372036854775807L;
        this.y = new long[0];
        this.z = new long[0];
    }

    public static Serializable c(int i, zzed zzedVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(zzedVar.zzr()));
        }
        if (i == 1) {
            return Boolean.valueOf(zzedVar.zzk() == 1);
        }
        if (i == 2) {
            return d(zzedVar);
        }
        if (i != 3) {
            if (i == 8) {
                return e(zzedVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(zzedVar.zzr())).doubleValue());
                zzedVar.zzG(2);
                return date;
            }
            int iZzn = zzedVar.zzn();
            ArrayList arrayList = new ArrayList(iZzn);
            for (int i2 = 0; i2 < iZzn; i2++) {
                Serializable serializableC = c(zzedVar.zzk(), zzedVar);
                if (serializableC != null) {
                    arrayList.add(serializableC);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strD = d(zzedVar);
            int iZzk = zzedVar.zzk();
            if (iZzk == 9) {
                return map;
            }
            Serializable serializableC2 = c(iZzk, zzedVar);
            if (serializableC2 != null) {
                map.put(strD, serializableC2);
            }
        }
    }

    public static String d(zzed zzedVar) {
        int iZzo = zzedVar.zzo();
        int iZzc = zzedVar.zzc();
        zzedVar.zzG(iZzo);
        return new String(zzedVar.zzH(), iZzc, iZzo);
    }

    public static HashMap e(zzed zzedVar) {
        int iZzn = zzedVar.zzn();
        HashMap map = new HashMap(iZzn);
        for (int i = 0; i < iZzn; i++) {
            String strD = d(zzedVar);
            Serializable serializableC = c(zzedVar.zzk(), zzedVar);
            if (serializableC != null) {
                map.put(strD, serializableC);
            }
        }
        return map;
    }

    public final boolean b(long j, zzed zzedVar) {
        if (zzedVar.zzk() != 2 || !"onMetaData".equals(d(zzedVar)) || zzedVar.zza() == 0 || zzedVar.zzk() != 8) {
            return false;
        }
        HashMap mapE = e(zzedVar);
        Object obj = mapE.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.x = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapE.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.y = new long[size];
                this.z = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.y = new long[0];
                        this.z = new long[0];
                        break;
                    }
                    this.y[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.z[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
