package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.LPt9Fixed;
import com.google.android.gms.internal.measurement.Xn1;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jc7 {
    public Xn1 a;
    public Long b;
    public long c;
    public final /* synthetic */ fs5 d;

    public /* synthetic */ jc7(fs5 fs5Var) {
        this.d = fs5Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b5  */
    public final Xn1 a(Xn1 xn1, String str) throws Throwable {
        boolean z;
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strY = xn1.y();
        List listZ = xn1.z();
        fs5 fs5Var = this.d;
        fs5Var.b.L();
        Long l = (Long) b37.j(xn1, "_eid");
        if (l != null) {
            boolean zEquals = strY.equals("_ep");
            dq6 dq6Var = fs5Var.a;
            r27 r27Var = fs5Var.b;
            if (zEquals) {
                r27Var.L();
                String str2 = (String) b37.j(xn1, "_en");
                Cursor cursor = null;
                if (TextUtils.isEmpty(str2)) {
                    bi6 bi6Var = dq6Var.i;
                    dq6.h(bi6Var);
                    bi6Var.g.c(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                    iy5 iy5Var = r27Var.c;
                    r27.E(iy5Var);
                    dq6 dq6Var2 = iy5Var.a;
                    iy5Var.e();
                    iy5Var.f();
                    try {
                        try {
                            cursorRawQuery = iy5Var.x().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((Xn1) ((km6) b37.w(Xn1.v(), cursorRawQuery.getBlob(0))).n(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e) {
                                        bi6 bi6Var2 = dq6Var2.i;
                                        dq6.h(bi6Var2);
                                        bi6Var2.f.e("Failed to merge main event. appId, eventId", bi6.n(str), l, e);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        bi6 bi6Var3 = dq6Var.i;
                                        dq6.h(bi6Var3);
                                        bi6Var3.g.d(str2, "Extra parameter without existing main event. eventName, eventId", l);
                                        return null;
                                    }
                                    this.a = (Xn1) obj;
                                    this.c = ((Long) pairCreate.second).longValue();
                                    r27Var.L();
                                    this.b = (Long) b37.j(this.a, "_eid");
                                } else {
                                    bi6 bi6Var4 = dq6Var2.i;
                                    dq6.h(bi6Var4);
                                    bi6Var4.n.b("Main event not found");
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                bi6 bi6Var5 = dq6Var2.i;
                                dq6.h(bi6Var5);
                                bi6Var5.f.c(e, "Error selecting main event");
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                bi6 bi6Var6 = dq6Var.i;
                                dq6.h(bi6Var6);
                                bi6Var6.g.d(str2, "Extra parameter without existing main event. eventName, eventId", l);
                                return null;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            cursorRawQuery = null;
                        } catch (Throwable th) {
                            th = th;
                            cursor = null;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                        cursorRawQuery.close();
                        pairCreate = null;
                        if (pairCreate != null) {
                        }
                        bi6 bi6Var7 = dq6Var.i;
                        dq6.h(bi6Var7);
                        bi6Var7.g.d(str2, "Extra parameter without existing main event. eventName, eventId", l);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                long j = this.c - 1;
                this.c = j;
                if (j <= 0) {
                    iy5 iy5Var2 = r27Var.c;
                    r27.E(iy5Var2);
                    iy5Var2.e();
                    dq6 dq6Var3 = iy5Var2.a;
                    bi6 bi6Var8 = dq6Var3.i;
                    dq6.h(bi6Var8);
                    bi6Var8.n.c(str, "Clearing complex main event info. appId");
                    try {
                        iy5Var2.x().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e4) {
                        bi6 bi6Var9 = dq6Var3.i;
                        dq6.h(bi6Var9);
                        bi6Var9.f.c(e4, "Error clearing complex main event");
                    }
                } else {
                    iy5 iy5Var3 = r27Var.c;
                    r27.E(iy5Var3);
                    iy5Var3.n(str, l, this.c, this.a);
                }
                ArrayList arrayList = new ArrayList();
                for (LPt9Fixed lPt9 : this.a.z()) {
                    r27Var.L();
                    if (b37.i(xn1, lPt9.x()) == null) {
                        arrayList.add(lPt9);
                    }
                }
                if (arrayList.isEmpty()) {
                    bi6 bi6Var10 = dq6Var.i;
                    dq6.h(bi6Var10);
                    bi6Var10.g.c(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listZ);
                    listZ = arrayList;
                }
                strY = str2;
            } else {
                this.b = l;
                this.a = xn1;
                r27Var.L();
                Serializable serializableJ = b37.j(xn1, "_epc");
                long jLongValue = ((Long) (serializableJ != null ? serializableJ : 0L)).longValue();
                this.c = jLongValue;
                if (jLongValue <= 0) {
                    bi6 bi6Var11 = dq6Var.i;
                    dq6.h(bi6Var11);
                    bi6Var11.g.c(strY, "Complex event with zero extra param count. eventName");
                } else {
                    iy5 iy5Var4 = r27Var.c;
                    r27.E(iy5Var4);
                    iy5Var4.n(str, l, this.c, xn1);
                }
            }
        }
        km6 km6Var = (km6) xn1.o();
        km6Var.w(strY);
        if (km6Var.y) {
            km6Var.p();
            z = false;
            km6Var.y = false;
        } else {
            z = false;
        }
        Xn1.D((Xn1) km6Var.x);
        if (km6Var.y) {
            km6Var.p();
            km6Var.y = z;
        }
        Xn1.C((Xn1) km6Var.x, listZ);
        return (Xn1) km6Var.n();
    }
}
