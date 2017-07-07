//
//  RNOrgImageView.m
//  RNOrgImageView
//
//  Created by Dowin on 2017/7/7.
//  Copyright © 2017年 Dowin. All rights reserved.
//

#import "RNOrgImageView.h"

@implementation RNOrgImageView

- (instancetype)init{
    if (self = [super init]) {
        self.contentMode = UIViewContentModeScaleAspectFit;
        self.clipsToBounds = YES;
    }
    return self;
}

- (void)setPath:(NSString *)path{
    if (path) {
        _path = path;
    }
}


- (void)layoutSubviews{
    if ([_path length]) {
        UIImage *img = [[UIImage alloc]initWithContentsOfFile:_path];
        self.image = img;
        
    }
}

@end
