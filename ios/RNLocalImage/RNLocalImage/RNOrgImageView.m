//
//  RNOrgImageView.m
//  RNOrgImageView
//
//  Created by Dowin on 2017/7/7.
//  Copyright © 2017年 Dowin. All rights reserved.
//

#import "RNOrgImageView.h"

@implementation RNOrgImageView

- (void)dealloc{
    [[NSNotificationCenter defaultCenter]removeObserver:self];
}

- (instancetype)init{
    if (self = [super init]) {
        self.contentMode = UIViewContentModeScaleAspectFit;
        self.clipsToBounds = YES;
        [self addNotificationToUpDataPic];
    }
    return self;
}

- (void)setPath:(NSString *)path{
    if (path) {
        _path = path;
        UIImage *img = [[UIImage alloc]initWithContentsOfFile:_path];
        self.image = img;
    }
}

- (void)addNotificationToUpDataPic{
    [[NSNotificationCenter defaultCenter]addObserver:self selector:@selector(clickUpdatePicNotification) name:@"RNNeteaseimDidCompletePic" object:nil];
}

- (void)clickUpdatePicNotification{
    if (!self.image) {
        UIImage *img = [[UIImage alloc]initWithContentsOfFile:_path];
        self.image = img;
    }
}

@end
