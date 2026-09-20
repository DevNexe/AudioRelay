package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.firebase.abt.component.AbtRegistrar;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.Purchases;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n8V_ implements ez, OnPaidEventListener, ol4, y14.QnHx, q22.QnHx, dc0.QnHx {
    public final /* synthetic */ int w;

    public /* synthetic */ n8V_(int i) {
        this.w = i;
    }

    @Override // defpackage.ez
    public Object a(cq3 cq3Var) {
        switch (this.w) {
            case 0:
                return AbtRegistrar.lambda$getComponents$0(cq3Var);
            default:
                Set setY = cq3Var.Y(o22.class);
                ea1 ea1Var = ea1.b;
                if (ea1Var == null) {
                    synchronized (ea1.class) {
                        ea1Var = ea1.b;
                        if (ea1Var == null) {
                            ea1Var = new ea1();
                            ea1.b = ea1Var;
                        }
                        break;
                    }
                }
                return new fi0(setY, ea1Var);
        }
    }

    @Override // y14.QnHx
    public Object apply(Object obj) {
        switch (this.w) {
            case 2:
                os0 os0Var = y14.B;
                return (List) y14.m(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new n8V_(5));
            case 3:
                Cursor cursor = (Cursor) obj;
                os0 os0Var2 = y14.B;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case 4:
                os0 os0Var3 = y14.B;
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 5:
                Cursor cursor2 = (Cursor) obj;
                os0 os0Var4 = y14.B;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    j4.QnHx qnHxA = ua5.a();
                    qnHxA.b(cursor2.getString(1));
                    qnHxA.c(ke3.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    qnHxA.b = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(qnHxA.a());
                }
                return arrayList;
            case 6:
                os0 os0Var5 = y14.B;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            case 7:
                Cursor cursor3 = (Cursor) obj;
                os0 os0Var6 = y14.B;
                ArrayList arrayList2 = new ArrayList();
                int length = 0;
                while (cursor3.moveToNext()) {
                    byte[] blob = cursor3.getBlob(0);
                    arrayList2.add(blob);
                    length += blob.length;
                }
                byte[] bArr = new byte[length];
                int length2 = 0;
                for (int i = 0; i < arrayList2.size(); i++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i);
                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                    length2 += bArr2.length;
                }
                return bArr;
            default:
                bc0 bc0Var = (bc0) obj;
                bf0.b.getClass();
                rt1 rt1Var = dc0.a;
                rt1Var.getClass();
                StringWriter stringWriter = new StringWriter();
                try {
                    rt1Var.a(bc0Var, stringWriter);
                    break;
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // dc0.QnHx
    public Object b(JsonReader jsonReader) {
        switch (this.w) {
            case 9:
                return dc0.d(jsonReader);
            case 10:
                return dc0.b(jsonReader);
            default:
                return dc0.a(jsonReader);
        }
    }

    @Override // defpackage.ol4
    public void c(yk4.QnHx qnHx) {
        ListenerConversionsKt.restorePurchasesWith(Purchases.Companion.getSharedInstance(), new tr3(qnHx), new ur3(qnHx));
    }

    @Override // q22.QnHx
    public String d(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
        return "auto";
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        a62.a.e("on_paid_event_admob_interstitial");
    }
}
