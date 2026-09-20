package defpackage;

import com.android.billingclient.api.NUlFixed;
import com.revenuecat.purchases.Purchases;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b70 implements bh3 {
    public static String a(String str, String str2) {
        return str + str2;
    }

    @Override // defpackage.bh3
    public void onPurchasesUpdated(NUlFixed nUl, List list) {
        Purchases.Companion.m7canMakePayments$lambda1(nUl, (ArrayList) list);
    }
}
