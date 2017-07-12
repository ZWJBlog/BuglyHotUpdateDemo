package com.example.msi.buglyhotupdatedemo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by MSI on 2017/7/12.
 */

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.example.msi.buglyhotupdatedemo.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}