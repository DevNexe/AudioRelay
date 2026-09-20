package defpackage;

import android.media.AudioRecord;
import com.azefsw.audioconnect.server.audio.capture.exceptions.AudioRecordReadException;
import com.azefsw.audioconnect.server.audio.capture.exceptions.AudioRecordUninitializedException;

/* JADX INFO: loaded from: classes.dex */
public final class xno extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<qk, sd5> A;
    public final /* synthetic */ bx B;
    public final /* synthetic */ fl3 C;
    public final /* synthetic */ lfe w;
    public final /* synthetic */ AudioRecord x;
    public final /* synthetic */ di y;
    public final /* synthetic */ MUpZ z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xno(lfe lfeVar, AudioRecord audioRecord, di diVar, MUpZ mUpZ, j81 j81Var, uw.QnHx qnHx, fl3 fl3Var) {
        super(0);
        this.w = lfeVar;
        this.x = audioRecord;
        this.y = diVar;
        this.z = mUpZ;
        this.A = j81Var;
        this.B = qnHx;
        this.C = fl3Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        String str;
        AudioRecord audioRecord = this.x;
        int i = this.y.e;
        P.W9 w9 = new P.W9(this.z, this.A);
        WP wp = new WP(this.B);
        Iq iq = new Iq(this.C);
        lfe lfeVar = this.w;
        lfeVar.getClass();
        a62 a62Var = a62.a;
        try {
            audioRecord.startRecording();
            boolean z = true;
            while (((Boolean) iq.invoke()).booleanValue()) {
                byte[] bArr = new byte[i];
                int i2 = audioRecord.read(bArr, 0, i);
                if (i2 < 0) {
                    if (i2 == -6) {
                        str = "ERROR_DEAD_OBJECT";
                    } else if (i2 == -3) {
                        str = "ERROR_INVALID_OPERATION";
                    } else if (i2 != -2) {
                        str = i2 != -1 ? "UNKNOWN_ERROR" : "ERROR";
                    } else {
                        str = "ERROR_BAD_VALUE";
                    }
                    wp.invoke(new AudioRecordReadException(i2, str));
                    break;
                }
                if (i2 == 0) {
                    a62 a62Var2 = a62.a;
                } else {
                    if (z) {
                        sAn san = lfeVar.b;
                        san.b = rz4.a(san.b, vz4.LPt8Fixed.a);
                        z = false;
                    }
                    w9.invoke(OW8.y(bArr, i2, 1));
                }
            }
        } catch (IllegalStateException e) {
            wp.invoke(new AudioRecordUninitializedException(e));
        }
        return sd5.a;
    }
}
