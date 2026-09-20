package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.FirebaseCommonRegistrar;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class un implements q22.QnHx, mi0.QnHx, dc0.QnHx, uw4 {
    public final /* synthetic */ int w;

    public /* synthetic */ un(int i) {
        this.w = i;
    }

    @Override // dc0.QnHx
    public final Object b(JsonReader jsonReader) throws IOException {
        String strConcat;
        String strNextString = null;
        switch (this.w) {
            case 4:
                rt1 rt1Var = dc0.a;
                jsonReader.beginObject();
                byte[] bArrDecode = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    if (strNextName.equals("filename")) {
                        strNextString = jsonReader.nextString();
                        if (strNextString == null) {
                            throw new NullPointerException("Null filename");
                        }
                    } else if (strNextName.equals("contents")) {
                        bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            throw new NullPointerException("Null contents");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                strConcat = strNextString == null ? " filename" : "";
                if (bArrDecode == null) {
                    strConcat = strConcat.concat(" contents");
                }
                if (strConcat.isEmpty()) {
                    return new u2(strNextString, bArrDecode);
                }
                throw new IllegalStateException("Missing required properties:".concat(strConcat));
            case 5:
                rt1 rt1Var2 = dc0.a;
                jsonReader.beginObject();
                Integer numValueOf = null;
                lj1 lj1Var = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    strNextName2.hashCode();
                    switch (strNextName2) {
                        case "frames":
                            ArrayList arrayList = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add(dc0.a(jsonReader));
                            }
                            jsonReader.endArray();
                            lj1Var = new lj1(arrayList);
                            break;
                        case "name":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                            break;
                        case "importance":
                            numValueOf = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                strConcat = strNextString == null ? " name" : "";
                if (numValueOf == null) {
                    strConcat = strConcat.concat(" importance");
                }
                if (lj1Var == null) {
                    strConcat = rz.a(strConcat, " frames");
                }
                if (strConcat.isEmpty()) {
                    return new g3(strNextString, numValueOf.intValue(), lj1Var);
                }
                throw new IllegalStateException("Missing required properties:".concat(strConcat));
            default:
                return dc0.a(jsonReader);
        }
    }

    @Override // q22.QnHx
    public final String d(Context context) {
        switch (this.w) {
            case 1:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    @Override // defpackage.uw4
    public final w05 e(Object obj) {
        return k15.e(null);
    }

    @Override // mi0.QnHx
    public final void f(pg3 pg3Var) {
    }
}
