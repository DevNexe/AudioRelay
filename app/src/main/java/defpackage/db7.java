package defpackage;

import android.os.Bundle;
import com.android.billingclient.api.CQf;
import com.android.billingclient.api.NUlFixed;
import com.android.billingclient.api.SkuDetails;
import com.google.android.gms.measurement.internal.zzgq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class db7 implements Callable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ String x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ db7(CQf cQf, String str, ArrayList arrayList, v9L v9l) {
        this.y = cQf;
        this.x = str;
        this.z = arrayList;
        this.A = v9l;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strD;
        int i;
        switch (this.w) {
            case 0:
                CQf cQf = (CQf) this.y;
                String str = this.x;
                List list = (List) this.z;
                om4 om4Var = (om4) this.A;
                cQf.getClass();
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        strD = "";
                        i = 0;
                    } else {
                        int i3 = i2 + 20;
                        ArrayList arrayList2 = new ArrayList(list.subList(i2, i3 > size ? size : i3));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            arrayList3.add(((r36) arrayList2.get(i4)).a);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle.putString("playBillingLibraryVersion", cQf.b);
                        try {
                            Bundle bundleB0 = cQf.n ? cQf.f.b0(cQf.e.getPackageName(), str, bundle, a36.b(cQf.j, cQf.t, cQf.b, arrayList2)) : cQf.f.u(cQf.e.getPackageName(), str, bundle);
                            if (bundleB0 == null) {
                                a36.f("BillingClient", "querySkuDetailsAsync got null sku details list");
                            } else {
                                if (bundleB0.containsKey("DETAILS_LIST")) {
                                    ArrayList<String> stringArrayList = bundleB0.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList == null) {
                                        a36.f("BillingClient", "querySkuDetailsAsync got null response list");
                                    } else {
                                        for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                                            try {
                                                SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i5));
                                                a36.e("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                                arrayList.add(skuDetails);
                                            } catch (JSONException e) {
                                                a36.g("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                                                strD = "Error trying to decode SkuDetails.";
                                                arrayList = null;
                                            }
                                        }
                                        i2 = i3;
                                    }
                                } else {
                                    int iA = a36.a(bundleB0, "BillingClient");
                                    strD = a36.d(bundleB0, "BillingClient");
                                    if (iA != 0) {
                                        StringBuilder sb = new StringBuilder(50);
                                        sb.append("getSkuDetails() failed. Response code: ");
                                        sb.append(iA);
                                        a36.f("BillingClient", sb.toString());
                                        i = iA;
                                    } else {
                                        a36.f("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                                    }
                                }
                                i = 6;
                            }
                            strD = "Item is unavailable for purchase.";
                            i = 4;
                        } catch (Exception e2) {
                            a36.g("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                            strD = "Service connection is disconnected.";
                            i = -1;
                        }
                        arrayList = null;
                    }
                    NUlFixed nUl = new NUlFixed();
                    nUl.a = i;
                    nUl.b = strD;
                    om4Var.a(nUl, arrayList);
                    return null;
                }
            default:
                zzgq zzgqVar = (zzgq) this.A;
                zzgqVar.w.a();
                iy5 iy5Var = zzgqVar.w.c;
                r27.E(iy5Var);
                return iy5Var.G(this.x, (String) this.y, (String) this.z);
        }
    }

    public db7(zzgq zzgqVar, String str, String str2, String str3) {
        this.A = zzgqVar;
        this.x = str;
        this.y = str2;
        this.z = str3;
    }
}
