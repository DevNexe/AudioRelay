package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i5 {
    public static IObjectWrapper a(Parcel parcel) {
        IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperL0;
    }

    public static String b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "OK";
        }
        if (i == 2) {
            return "TRANSIENT_ERROR";
        }
        if (i == 3) {
            return "FATAL_ERROR";
        }
        return i == 4 ? "INVALID_PAYLOAD" : "null";
    }
}
