package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jl2 extends cx1 implements x81<g34, il2, Bundle> {
    public static final jl2 w = new jl2();

    public jl2() {
        super(2);
    }

    @Override // defpackage.x81
    public final Bundle invoke(g34 g34Var, il2 il2Var) {
        Bundle bundle;
        il2 il2Var2 = il2Var;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : t92.W(il2Var2.v.a).entrySet()) {
            ((zl2) entry.getValue()).getClass();
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        syh<kk2> syhVar = il2Var2.g;
        if (!syhVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[syhVar.y];
            Iterator<kk2> it = syhVar.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new pk2(it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = il2Var2.l;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i2] = iIntValue;
                arrayList2.add(str);
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = il2Var2.m;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                syh syhVar2 = (syh) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[syhVar2.y];
                int i3 = 0;
                for (Object obj : syhVar2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        ps0.j0();
                        throw null;
                    }
                    parcelableArr2[i3] = (pk2) obj;
                    i3 = i4;
                }
                bundle.putParcelableArray(b70.a("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (il2Var2.f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", il2Var2.f);
        }
        return bundle;
    }
}
