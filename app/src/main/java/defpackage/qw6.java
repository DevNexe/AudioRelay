package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.NUlFixed;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qw6 extends BroadcastReceiver {
    public static final /* synthetic */ int d = 0;
    public final bh3 a;
    public boolean b;
    public final /* synthetic */ cq4 c;

    public /* synthetic */ qw6(cq4 cq4Var) {
        this.c = cq4Var;
        this.a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NUlFixed nUlC = a36.c(intent, "BillingBroadcastManager");
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras != null) {
            ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            ArrayList arrayList2 = new ArrayList();
            if (stringArrayList == null || stringArrayList2 == null) {
                Purchase purchaseH = a36.h(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                if (purchaseH == null) {
                    a36.e("BillingHelper", "Couldn't find single purchase data as well.");
                } else {
                    arrayList2.add(purchaseH);
                }
            } else {
                int size = stringArrayList.size();
                StringBuilder sb = new StringBuilder(40);
                sb.append("Found purchase list of ");
                sb.append(size);
                sb.append(" items");
                a36.e("BillingHelper", sb.toString());
                for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                    Purchase purchaseH2 = a36.h(stringArrayList.get(i), stringArrayList2.get(i));
                    if (purchaseH2 != null) {
                        arrayList2.add(purchaseH2);
                    }
                }
            }
            arrayList = arrayList2;
        }
        this.a.onPurchasesUpdated(nUlC, arrayList);
    }

    public /* synthetic */ qw6(cq4 cq4Var, bh3 bh3Var) {
        this.c = cq4Var;
        this.a = bh3Var;
    }
}
