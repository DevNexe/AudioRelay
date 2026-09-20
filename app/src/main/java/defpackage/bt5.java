package defpackage;

import com.google.android.gms.internal.ads.zzabu;
import com.google.android.gms.internal.ads.zzem;
import com.google.android.gms.internal.ads.zzfus;
import com.google.android.gms.internal.ads.zzfuv;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class bt5 {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzfuv a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        zzfus zzfusVarZzi = zzfuv.zzi();
        do {
            xmlPullParser.next();
            if (zzem.zzc(xmlPullParser, strConcat)) {
                String strZza = zzem.zza(xmlPullParser, str2.concat(":Mime"));
                String strZza2 = zzem.zza(xmlPullParser, str2.concat(":Semantic"));
                String strZza3 = zzem.zza(xmlPullParser, str2.concat(":Length"));
                String strZza4 = zzem.zza(xmlPullParser, str2.concat(":Padding"));
                if (strZza == null || strZza2 == null) {
                    return zzfuv.zzo();
                }
                zzfusVarZzi.zze(new zzabu(strZza, strZza2, strZza3 != null ? Long.parseLong(strZza3) : 0L, strZza4 != null ? Long.parseLong(strZza4) : 0L));
            }
        } while (!zzem.zzb(xmlPullParser, strConcat2));
        return zzfusVarZzi.zzg();
    }
}
