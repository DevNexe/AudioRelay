package defpackage;

import android.content.Context;
import android.os.Build;
import com.azefsw.audioconnect.R;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma implements Callable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ma(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws SocketException {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                return (ss) obj;
            case 1:
                DatagramSocket datagramSocket = new DatagramSocket();
                datagramSocket.setBroadcast(true);
                datagramSocket.setReuseAddress(true);
                return datagramSocket;
            default:
                d7G d7g = (d7G) obj;
                ArrayList arrayList = new ArrayList();
                OW8.f(arrayList, new uj2(((gk0) d7g.y).b(), "full_device_name"));
                OW8.f(arrayList, new uj2(Build.MODEL, "model"));
                String string = Build.MANUFACTURER;
                if (string.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = string.charAt(0);
                    sb.append((Object) (Character.isLowerCase(cCharAt) ? Th.x(cCharAt, Locale.getDefault()) : String.valueOf(cCharAt)));
                    sb.append(string.substring(1));
                    string = sb.toString();
                }
                OW8.f(arrayList, new uj2(string, "manufacturer"));
                if (Build.VERSION.SDK_INT >= 24) {
                    arrayList.add(new uj2(((Context) d7g.x).getString(R.string.pref_name_editor_suggestion_bedroom), "bedroom"));
                }
                arrayList.add(new uj2(((Context) d7g.x).getString(R.string.pref_name_editor_suggestion_living_room), "living_room"));
                arrayList.add(new uj2(((Context) d7g.x).getString(R.string.pref_name_editor_suggestion_kitchen), "kitchen"));
                int i2 = 0;
                while (i2 < 2) {
                    i2++;
                    arrayList.add(new uj2(((Context) d7g.x).getString(R.string.pref_name_editor_suggestion_speaker_number, Integer.valueOf(i2)), "speaker"));
                }
                int i3 = 0;
                while (i3 < 2) {
                    i3++;
                    arrayList.add(new uj2(((Context) d7g.x).getString(R.string.pref_name_editor_suggestion_microphone_number, Integer.valueOf(i3)), "mic"));
                }
                return arrayList;
        }
    }
}
