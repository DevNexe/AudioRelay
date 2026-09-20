package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ay0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public ay0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = cv4.a;
        oa3.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static ay0 a(Context context) {
        cq4 cq4Var = new cq4(context);
        String strI = cq4Var.i("google_app_id");
        if (TextUtils.isEmpty(strI)) {
            return null;
        }
        return new ay0(strI, cq4Var.i("google_api_key"), cq4Var.i("firebase_database_url"), cq4Var.i("ga_trackingId"), cq4Var.i("gcm_defaultSenderId"), cq4Var.i("google_storage_bucket"), cq4Var.i("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ay0)) {
            return false;
        }
        ay0 ay0Var = (ay0) obj;
        return tq2.a(this.b, ay0Var.b) && tq2.a(this.a, ay0Var.a) && tq2.a(this.c, ay0Var.c) && tq2.a(this.d, ay0Var.d) && tq2.a(this.e, ay0Var.e) && tq2.a(this.f, ay0Var.f) && tq2.a(this.g, ay0Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        tq2.QnHx qnHx = new tq2.QnHx(this);
        qnHx.a(this.b, "applicationId");
        qnHx.a(this.a, "apiKey");
        qnHx.a(this.c, "databaseUrl");
        qnHx.a(this.e, "gcmSenderId");
        qnHx.a(this.f, "storageBucket");
        qnHx.a(this.g, "projectId");
        return qnHx.toString();
    }
}
