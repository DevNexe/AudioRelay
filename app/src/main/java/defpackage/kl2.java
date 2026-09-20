package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kl2 extends cx1 implements j81<Bundle, il2> {
    public final /* synthetic */ Context w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl2(Context context) {
        super(1);
        this.w = context;
    }

    @Override // defpackage.j81
    public final il2 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        Context context = this.w;
        il2 il2Var = new il2(context);
        z20 z20Var = new z20();
        cm2 cm2Var = il2Var.v;
        cm2Var.a(z20Var);
        cm2Var.a(new vk0());
        bundle2.setClassLoader(context.getClassLoader());
        il2Var.d = bundle2.getBundle("android-support-nav:controller:navigatorState");
        il2Var.e = bundle2.getParcelableArray("android-support-nav:controller:backStack");
        LinkedHashMap linkedHashMap = il2Var.m;
        linkedHashMap.clear();
        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                il2Var.l.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                i++;
                i2++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                if (parcelableArray != null) {
                    syh syhVar = new syh(parcelableArray.length);
                    tj1 tj1Var = new tj1(parcelableArray);
                    while (tj1Var.hasNext()) {
                        Parcelable parcelable = (Parcelable) tj1Var.next();
                        if (parcelable == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        }
                        syhVar.addLast((pk2) parcelable);
                    }
                    linkedHashMap.put(str, syhVar);
                }
            }
        }
        il2Var.f = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        return il2Var;
    }
}
