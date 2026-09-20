package com.android.billingclient.api;

import android.os.Bundle;
import android.text.TextUtils;
import defpackage.a36;
import defpackage.ah3;
import defpackage.es5;
import defpackage.qb7;
import defpackage.ra7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class YKK implements Callable {
    public final /* synthetic */ String w;
    public final /* synthetic */ ah3 x;
    public final /* synthetic */ CQf y;

    public YKK(CQf cQf, String str, ah3 ah3Var) {
        this.y = cQf;
        this.w = str;
        this.x = ah3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ArrayList<Purchase> fakePurchases = new ArrayList<>();
        
        // Создаем JSON-строку валидной покупки с вашей премиум-строкой/SKU
        JSONObject fakeJson = new JSONObject();
        try {
            fakeJson.put("productId", "premium_feature_server_unlimited_time_title"); // или ваш ID подписки
            fakeJson.put("purchaseToken", "fake_unlimited_token_12345");
            fakeJson.put("purchaseState", 0); // 0 = PURCHASED
            fakeJson.put("acknowledged", true);
        } catch (Exception e) {}

        // Добавляем фейковую покупку
        fakePurchases.add(new Purchase(fakeJson.toString(), "fake_signature"));

        // Передаем список в колбэк приложения
        Purchase.QnHx fakeResult = new Purchase.QnHx(T23.k, fakePurchases);
        this.x.b(fakeResult.b, fakeResult.a);

        return null;
    }
}
