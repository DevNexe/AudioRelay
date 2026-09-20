package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.CQf;
import com.android.billingclient.api.NUlFixed;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.T23;
import com.android.billingclient.api.byN;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.measurement.internal.zzgq;
import com.revenuecat.purchases.google.QnHx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vt5 implements Callable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ vt5(CQf cQf, Object obj, Object obj2, int i) {
        this.w = i;
        this.x = cQf;
        this.y = obj;
        this.z = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        cq4 cq4Var;
        Object obj;
        Object obj2 = null;
        switch (this.w) {
            case 0:
                CQf cQf = (CQf) this.x;
                String str = (String) this.y;
                String strValueOf = String.valueOf(str);
                a36.e("BillingClient", strValueOf.length() != 0 ? "Querying purchase history, item type: ".concat(strValueOf) : new String("Querying purchase history, item type: "));
                ArrayList arrayList = new ArrayList();
                boolean z = cQf.m;
                boolean z2 = cQf.t;
                String str2 = cQf.b;
                Bundle bundle = new Bundle();
                bundle.putString("playBillingLibraryVersion", str2);
                if (z && z2) {
                    bundle.putBoolean("enablePendingPurchases", true);
                }
                String string = null;
                while (true) {
                    int i = 5;
                    if (cQf.k) {
                        try {
                            Bundle bundleE0 = cQf.f.e0(cQf.e.getPackageName(), str, string, bundle);
                            NUlFixed nUlA = byN.a(bundleE0, "getPurchaseHistory()");
                            if (nUlA != T23.k) {
                                cq4Var = new cq4(nUlA, obj2, i);
                            } else {
                                ArrayList<String> stringArrayList = bundleE0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList2 = bundleE0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList3 = bundleE0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                                    String str3 = stringArrayList2.get(i2);
                                    String str4 = stringArrayList3.get(i2);
                                    String strValueOf2 = String.valueOf(stringArrayList.get(i2));
                                    a36.e("BillingClient", strValueOf2.length() != 0 ? "Purchase record found for sku : ".concat(strValueOf2) : new String("Purchase record found for sku : "));
                                    try {
                                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                                        JSONObject jSONObject = purchaseHistoryRecord.c;
                                        if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                            a36.f("BillingClient", "BUG: empty/null token!");
                                        }
                                        arrayList.add(purchaseHistoryRecord);
                                    } catch (JSONException e) {
                                        a36.g("BillingClient", "Got an exception trying to decode the purchase!", e);
                                        obj = null;
                                        cq4Var = new cq4(T23.j, obj, i);
                                    }
                                }
                                string = bundleE0.getString("INAPP_CONTINUATION_TOKEN");
                                String strValueOf3 = String.valueOf(string);
                                a36.e("BillingClient", strValueOf3.length() != 0 ? "Continuation token: ".concat(strValueOf3) : new String("Continuation token: "));
                                if (TextUtils.isEmpty(string)) {
                                    cq4Var = new cq4(T23.k, arrayList, i);
                                    obj = null;
                                } else {
                                    obj2 = null;
                                }
                            }
                        } catch (RemoteException e2) {
                            a36.g("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                            obj = null;
                            cq4Var = new cq4(T23.l, obj, i);
                        }
                        ((xg3) this.z).e((NUlFixed) cq4Var.y, (List) cq4Var.x);
                        return obj;
                    }
                    a36.f("BillingClient", "getPurchaseHistory is not supported on current device");
                    cq4Var = new cq4(T23.p, obj2, i);
                }
                obj = obj2;
                ((xg3) this.z).e((NUlFixed) cq4Var.y, (List) cq4Var.x);
                return obj;
            case 1:
                CQf cQf2 = (CQf) this.x;
                NRbR nRbR = (NRbR) this.y;
                QnHx qnHx = (QnHx) this.z;
                cQf2.getClass();
                try {
                    zze zzeVar = cQf2.f;
                    String packageName = cQf2.e.getPackageName();
                    String str5 = nRbR.a;
                    String str6 = cQf2.b;
                    int i3 = a36.a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("playBillingLibraryVersion", str6);
                    Bundle bundleL = zzeVar.l(packageName, str5, bundle2);
                    int iA = a36.a(bundleL, "BillingClient");
                    String strD = a36.d(bundleL, "BillingClient");
                    NUlFixed nUl = new NUlFixed();
                    nUl.a = iA;
                    nUl.b = strD;
                    qnHx.a(nUl);
                } catch (Exception e3) {
                    a36.g("BillingClient", "Error acknowledge purchase!", e3);
                    qnHx.a(T23.l);
                }
                return null;
            case 2:
                CQf cQf3 = (CQf) this.x;
                return cQf3.f.A0(cQf3.e.getPackageName(), (String) this.y, (String) this.z);
            default:
                zzgq zzgqVar = (zzgq) this.x;
                zzgqVar.w.a();
                ny6 ny6Var = zzgqVar.w.h;
                r27.E(ny6Var);
                ny6Var.e();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public vt5(zzgq zzgqVar, m16 m16Var, String str) {
        this.w = 3;
        this.x = zzgqVar;
        this.z = m16Var;
        this.y = str;
    }
}
