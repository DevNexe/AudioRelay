package defpackage;

import com.google.protobuf.SjP;

/* JADX INFO: loaded from: classes.dex */
public enum vf3 implements SjP.QnHx {
    UNKNOWN(0),
    WINDOWS(1),
    LINUX(2),
    MAC_OS(3),
    IOS(4),
    ANDROID(5),
    ANDROID_TV(6),
    UNRECOGNIZED(-1);

    public final int w;

    static {
        values();
    }

    vf3(int i) {
        this.w = i;
    }

    public static vf3 a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return WINDOWS;
            case 2:
                return LINUX;
            case 3:
                return MAC_OS;
            case 4:
                return IOS;
            case 5:
                return ANDROID;
            case 6:
                return ANDROID_TV;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.SjP.QnHx
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
