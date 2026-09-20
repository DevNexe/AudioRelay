package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class laH extends xx2 {
    public final Context d;

    public laH(Context context, op2 op2Var) {
        super(op2Var);
        this.d = context;
    }

    @Override // defpackage.xx2
    public final mp2 a() {
        Context context = this.d;
        return new mp2("NO_AUDIO_DATA", context.getString(R.string.running_notice_audio_no_audio_data_title), context.getString(R.string.running_notice_audio_no_audio_data_description, 59100), (String) null, 24);
    }

    @Override // defpackage.xx2
    public final mp2 b() {
        Context context = this.d;
        return new mp2("AUDIO_DATA_TIMEOUT", context.getString(R.string.running_notice_audio_data_timeout_title), context.getString(R.string.running_notice_audio_data_timeout_description), (String) null, 24);
    }
}
