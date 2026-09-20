package defpackage;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends FLr<String[], Map<String, Boolean>> {
    @Override // defpackage.FLr
    public final Intent a(Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
    }

    @Override // defpackage.FLr
    public final FLr.QnHx b(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        boolean z = true;
        if (strArr.length == 0) {
            return new FLr.QnHx(ds0.w);
        }
        for (String str : strArr) {
            if (!(r80.a(componentActivity, str) == 0)) {
                z = false;
                break;
            }
        }
        if (!z) {
            return null;
        }
        int iA = C0239D.A(strArr.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (String str2 : strArr) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new FLr.QnHx(linkedHashMap);
    }

    @Override // defpackage.FLr
    public final Object c(Intent intent, int i) {
        ds0 ds0Var = ds0.w;
        if (i != -1 || intent == null) {
            return ds0Var;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return ds0Var;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        ArrayList arrayListE0 = oV9.e0(stringArrayExtra);
        Iterator it = arrayListE0.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(mu.w0(arrayListE0, 10), mu.w0(arrayList, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new uy2(it.next(), it2.next()));
        }
        return t92.V(arrayList2);
    }
}
