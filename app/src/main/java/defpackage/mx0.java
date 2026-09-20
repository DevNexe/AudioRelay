package defpackage;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mx0 {
    public final pg3<CSv> a;
    public final String b = "frc";
    public Integer c = null;

    public mx0(pg3 pg3Var) {
        this.a = pg3Var;
    }

    public final List<CSv.CQf> a() {
        return this.a.get().g(this.b);
    }

    public final void b(ArrayList arrayList) throws AbtException {
        pg3<CSv> pg3Var = this.a;
        if (pg3Var.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<jS> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            String[] strArr = jS.g;
            ArrayList arrayList3 = new ArrayList();
            String[] strArr2 = jS.g;
            for (int i = 0; i < 5; i++) {
                String str = strArr2[i];
                if (!map.containsKey(str)) {
                    arrayList3.add(str);
                }
            }
            if (!arrayList3.isEmpty()) {
                throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
            }
            try {
                arrayList2.add(new jS((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", jS.h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
        if (arrayList2.isEmpty()) {
            if (pg3Var.get() == null) {
                throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
            Iterator<CSv.CQf> it2 = a().iterator();
            while (it2.hasNext()) {
                pg3Var.get().f(it2.next().b);
            }
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            hashSet.add(((jS) it3.next()).a);
        }
        List<CSv.CQf> listA = a();
        HashSet hashSet2 = new HashSet();
        Iterator<CSv.CQf> it4 = listA.iterator();
        while (it4.hasNext()) {
            hashSet2.add(it4.next().b);
        }
        ArrayList arrayList4 = new ArrayList();
        for (CSv.CQf cQf : listA) {
            if (!hashSet.contains(cQf.b)) {
                arrayList4.add(cQf);
            }
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            pg3Var.get().f(((CSv.CQf) it5.next()).b);
        }
        ArrayList<jS> arrayList5 = new ArrayList();
        for (jS jSVar : arrayList2) {
            if (!hashSet2.contains(jSVar.a)) {
                arrayList5.add(jSVar);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(a());
        Integer num = this.c;
        String str2 = this.b;
        if (num == null) {
            this.c = Integer.valueOf(pg3Var.get().e(str2));
        }
        int iIntValue = this.c.intValue();
        for (jS jSVar2 : arrayList5) {
            while (arrayDeque.size() >= iIntValue) {
                pg3Var.get().f(((CSv.CQf) arrayDeque.pollFirst()).b);
            }
            jSVar2.getClass();
            CSv.CQf cQf2 = new CSv.CQf();
            cQf2.a = str2;
            cQf2.m = jSVar2.d.getTime();
            cQf2.b = jSVar2.a;
            cQf2.c = jSVar2.b;
            String str3 = jSVar2.c;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            cQf2.d = str3;
            cQf2.e = jSVar2.e;
            cQf2.j = jSVar2.f;
            pg3Var.get().d(cQf2);
            arrayDeque.offer(cQf2);
        }
    }
}
