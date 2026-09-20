package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.os.Build;
import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mk5 implements nk5, ol4, y14.QnHx, q22.QnHx, kz, dc0.QnHx {
    public final /* synthetic */ int w;

    public /* synthetic */ mk5(int i) {
        this.w = i;
    }

    @Override // defpackage.kz
    public final List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // y14.QnHx
    public final Object apply(Object obj) {
        switch (this.w) {
            case 4:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            default:
                Cursor cursor = (Cursor) obj;
                os0 os0Var = y14.B;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return null;
        }
    }

    @Override // dc0.QnHx
    public final Object b(JsonReader jsonReader) throws IOException {
        switch (this.w) {
            case 8:
                return dc0.b(jsonReader);
            default:
                rt1 rt1Var = dc0.a;
                d3.QnHx qnHx = new d3.QnHx();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "name":
                            String strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                throw new NullPointerException("Null name");
                            }
                            qnHx.c = strNextString;
                            break;
                            break;
                        case "size":
                            qnHx.b = Long.valueOf(jsonReader.nextLong());
                            break;
                        case "uuid":
                            qnHx.d = new String(Base64.decode(jsonReader.nextString(), 2), bc0.a);
                            break;
                        case "baseAddress":
                            qnHx.a = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return qnHx.a();
        }
    }

    @Override // defpackage.ol4
    public final void c(yk4.QnHx qnHx) {
        switch (this.w) {
            case 1:
                qx0 qx0VarB = qx0.b();
                qx0VarB.a();
                cy0 cy0VarC = ((lm3) qx0VarB.d.d(lm3.class)).c();
                hy0.QnHx qnHx2 = new hy0.QnHx();
                fy0.w.invoke(qnHx2);
                kc7 kc7VarC = k15.c(new te0(3, cy0VarC, new hy0(qnHx2)), cy0VarC.b);
                kc7VarC.e(d15.a, new Z7O(2, qnHx, cy0VarC));
                kc7VarC.c(new gcF(qnHx));
                break;
            default:
                Object obj = xx0.m;
                qx0 qx0VarB2 = qx0.b();
                qx0VarB2.a();
                ((xx0) qx0VarB2.d.d(yx0.class)).a().q(new im3(qnHx, 0));
                break;
        }
    }

    @Override // q22.QnHx
    public final String d(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }
}
